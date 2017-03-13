package org.hand;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IoTest01 extends JFrame {
	JTextField jtfUrl; // 输入文件地址url
	JButton jbGetFile; // 取文件按钮
	JFileChooser jFileChooser;
	JLabel jlInfo; // 显示提示信息

	public static void main(String[] args) throws Exception {
		new IoTest01();
		//down();
	}

	public IoTest01() {
		super("从网络下载文件");
		JPanel p=new JPanel(); //面板,用于容纳地址输入框和取文件按钮
		Container container=getContentPane();//得到容器
		 jtfUrl=new JTextField(18); //地址输入框
		 jbGetFile=new JButton("取文件"); //按钮
		 jlInfo=new JLabel(); 
		 jFileChooser = new JFileChooser();
		 
		p.add(jtfUrl); //增加组件到面板上
		p.add(jbGetFile);
		p.add(jFileChooser);
		container.add(p,BorderLayout.NORTH); //增加组件到容器上
		container.add(jlInfo,BorderLayout.CENTER);
		jbGetFile.addActionListener(new ActionListener() { // 按钮事件处理
			public void actionPerformed(ActionEvent ent) {
				try {
					File file = jFileChooser.getSelectedFile();
					System.out.println("file"+file.getParentFile());
					jlInfo.setText("正在读取");
					down(jtfUrl.getText(),file.getAbsolutePath());
					jlInfo.setText("读取文件成功");
				} // 显示提示信息
				catch (Exception ex) {
					ex.printStackTrace(); // 输出出错信息
					jlInfo.setText("读取文件失败");
				}
			}
		});
		setSize(600, 500); // 设置窗口尺寸
		setVisible(true); // 设置窗口可视
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		;// 关闭窗口时退出程序
	}

	private static void down( String Url, String fileName) throws Exception {
		System.out.println("文件"+fileName);
		URL url = new URL(Url);
		URLConnection UrlConn = url.openConnection();// 打开链接
		InputStream inputStream = UrlConn.getInputStream();
		BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);// 缓冲字节流
		System.out.println(UrlConn.getConnectTimeout());

		File file = new File(fileName);
		/*if (!(file.exists())) {// 判断文件存在
			System.out.println("文件不存在");
			file.createNewFile();// 新建文件
		}*/
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
		byte[] b = new byte[512];
		int i;
		while ((i = bufferedInputStream.read(b)) != -1) {
			bufferedOutputStream.write(b, 0, i);
		}
		bufferedOutputStream.flush();
		bufferedOutputStream.close();
		bufferedInputStream.close();

	}

}
