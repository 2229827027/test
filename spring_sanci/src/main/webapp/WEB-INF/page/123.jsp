<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="font-size: 20px;">
	<div class="bigkuang" style="margin-left: 400px;margin-top: 50px;">
			<div style="float: left;">
				<span>单据编号:</span>
				<input type="text" style="width: 60%;margin: 0 0 10px 0;"/><br />
				<span>供应商:</span>
				<input type="text" style="width: 60%;margin: 0 0 10px 20px;"/><br />
				<span>部门:</span>
				<input type="text" style="width: 60%;margin: 0 0 10px 40px;"/><br />
				<span>采购人员:</span>
				<input type="text" style="width: 60%;margin: 0 0 10px 0x;"/><br />
			</div>
			
			<div style="float: left;margin-left: 20px;margin-top: -2px;">
				<span>单据日期:</span>
				<input type="date" style="width: 60%;margin: 0 0 10px 0;"/><br />
				<span>地址:</span>
				<input type="text" style="width: 60%;margin: 0 0 10px 40px;"/><br />
				<span>仓库:</span>
				<input type="text" style="width: 60%;margin: 0 0 10px 40px;"/><br />
				<span>制单人员:</span>
				<input type="text" style="width: 60%;margin: 0 0 10px 0"/><br />
			</div>
			<div style="clear: both;"></div>
		 	<div>
		 		<span>入库明细:</span>
		 		<textarea rows="3" cols="50" style="width: 440px;height: 100px;"></textarea>
		 	</div>
		 	<div style="margin-top: 100px">
		 		<button>加载测试数据</button>
		 		<button>加载服务端数据</button>
		 		<button>保存</button>
		 		<button>清空</button>
		 	</div>
		</div>
</body>
</html>