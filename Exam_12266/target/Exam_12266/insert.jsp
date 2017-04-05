<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${ctx }/css/bootstrap.min.css" />

<link rel="stylesheet" href="${ctx }/css/bootstrap-responsive.min.css" />

<link rel="stylesheet" href="${ctx }/css/unicorn.main.css" />

<link rel="stylesheet" href="${ctx }/css/unicorn.blue.css" class="skin-color" />

     <!-- 日期控件样式 -->

     <link rel="stylesheet" href="${ctx }/css/datepicker.css" />

     <!-- jQuery操作提示信息样式 -->

     <link rel="stylesheet" href="${ctx }/css/jquery.gritter.css" />

    <!-- 美化checkbox, radio, file样式 -->

     <link rel="stylesheet" href="${ctx }/css/uniform.css" />

<!-- 美化select样式 -->

<link rel="stylesheet" href="${ctx }/css/select2.css" />
<!-- 通用js控件 -->
<script src="${ctx }/js/jquery.min.js"></script>
<script src="${ctx }/js/jquery.ui.custom.js"></script>
<script src="${ctx }/js/bootstrap.min.js"></script>
<script src="${ctx }/js/unicorn.js"></script>
<!-- 日期控件 -->
<script src="${ctx }/js/bootstrap-datepicker.js"></script>
<!-- 美化checkbox, radio, file控件 -->
<script src="${ctx }/js/jquery.uniform.js"></script>
<!-- 美化select控件 -->
<script src="${ctx }/js/select2.min.js"></script>
<!-- jquery校验控件 -->
<script src="${ctx }/js/jquery.validate.js"></script>
<!-- jquery校验提示信息 -->
<script src="${ctx }/js/jquery.messages.cn.js"></script>
<!-- jquery操作提示信息 -->
<script src="${ctx }/js/jquery.gritter.min.js"></script>
<!--[if IE 6]><script src="js/ie6.min.js"></script><![endif]-->
<!-- jquery.dataTables控件 -->
<script src="${ctx }/js/jquery.dataTables.min.js"></script>

<script>
            $(document).ready(function(){
// 美化checkbox, radio, file控件
                $('input[type=checkbox],input[type=radio],input[type=file]').uniform({
                    fileDefaultText: '未选择任何文件',
                    fileBtnText: '选择文件'
                });
                // 美化select控件
                $('select').select2();


                // 表格复选框全选
                $("th input:checkbox").click(function() {
                    var checkedStatus = this.checked;
                    var checkbox = $(this).parents('.widget-box').find('tr td:first-child input:checkbox');
                    checkbox.each(function() {
                        this.checked = checkedStatus;
                        if (checkedStatus == this.checked) {
                            $(this).closest('.checker > span').removeClass('checked');
                        }
                        if (this.checked) {
                            $(this).closest('.checker > span').addClass('checked');
                        }
                    });
                });


                // 为表格启用jquery.dataTables控件
                $('.data-table').dataTable({
                    "bPaginate": true, // 翻页功能
                    "bJQueryUI": true, // 是否应用jquery ui themeroller的风格
                    "bLengthChange": false, // 改变每页显示数据数量
                    "bFilter": false, // 过滤功能
                    "bSort": true, // 排序功能
                    "bInfo": false, // 页脚信息
                    "sPaginationType": "full_numbers", // 显示数字的翻页样式
                    "sDom": '<""l>t<"F"fp>',
                    "bAutoWidth": true, // 自适应宽度
                    "iDisplayLength": 10, // 设置每页显示的数据个数
                    "oLanguage": { // 设置提示信息国际化
                        "sUrl": "${ctx }/js/jquery.pager.cn.txt" //此处调用实现分页的效果
                    }
                });
});
 </script>
</head>
<body>
	


<div class="modal hide fade" id="addChannelInfoModal"  tabindex="-1" role="dialog">
<div class="modal-header"><button class="close" type="button" data-dismiss="modal">×</button>
<h3>基本信息</h3>
</div>
<div class="modal-body"></div>
</div>
<!-- 频道信息新增 Modal end -->
channel_info_add.jsp页面
<form action="ChannelManageAction.a" method="post" enctype="multipart/form-data" 
class="form-horizontal" id="basic_validate" novalidate="novalidate">
        <div class="control-group">
             <label class="control-label">first name:</label>
             <div class="controls">
                 <input style="width:180px" type="text" name="channelName">
             </div>
         </div>
         <div class="control-group">
             <label class="control-label" for="s2">last_name:</label>
             <div class="controls">
                         <select  style="width:200px;" name="channelType"  id="s2">
<app:dictselect dictType="1105"/>
</select>
             </div>
         </div>
         <div class="control-group">
             <label class="control-label">Email:</label>
             <div class="controls">
                 <input style="width:180px" type="text" name="channelSignal" onblur="checkChannelSignal('',this.value)">
                 <span id="showMsg" style="color: red"></span>
             </div>
         </div>
         <div class="control-group">
             <label class="control-label">address:</label>
             <div class="controls">
                <input type="file" name="fileContent" id="fileContent">
             </div>
         </div>
         <div class="form-actions" style="padding-left: 180px;">
             <button type="submit" name="doAddChannelInfo" class="btn btn-primary">
             <i class="icon-ok icon-white"></i>提交</button>&nbsp;&nbsp;
             <button type="button" class="btn btn-primary cancelBtn">
             <i class="icon-remove icon-white"></i>取消</button>
         </div>
</form>
</body>
</html>