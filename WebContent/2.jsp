<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
		.tablestyle{ border-collapse:collapse;width:1200px;font-size:14px;
		}
		.tablestyle th{  height:20px; border:1px solid #000; text-align:center;}
		.tablestyle td{  height:20px; border:1px solid #000; text-align:center;}
		.field2_color{background-color:#EBF1DE}
	    .inputStyle3{width:110px;height:100%;border:0px solid white;}
  </style>
</head>
<body>
    <table class="tablestyle">
					 <tr>
						<td width="120" class="field2_color">地市</td>
						<td width="120"><input type="text" class="inputStyle3" /></td>
						<td width="120" class="field2_color">区县</td>
						<td width="120"><input type="text" class="inputStyle3" /></td>
						<td width="120" class="field2_color">面积</td>
						<td width="120"><input type="text" class="inputStyle3" /></td>
						<td width="120" class="field2_color">门面数</td>
						<td width="120"><input type="text" class="inputStyle3" /></td>
						<td width="120" class="field2_color">投资费用（元）</td>
						<td width="120"><input type="text" class="inputStyle3" /></td>
					 </tr>
					 
					 <tr>
						<td  class="field2_color">门店区域（核心商圈/社区门店/农村乡镇）</td>
						<td><input type="text" class="inputStyle3" /></td>
						<td  class="field2_color">商圈名/社区名/乡镇名</td>
						<td ><input type="text" class="inputStyle3" /></td>
						<td class="field2_color">覆盖人口数</td>
						<td><input type="text" class="inputStyle3" /></td>
						<td class="field2_color">分公司申报人</td>
						<td><input type="text" class="inputStyle3" /></td>
						<td class="field2_color">联系电话</td>
						<td ><input type="text" class="inputStyle3" /></td>
					 </tr>
					 
					  <tr>
						<td rowspan="2" class="field2_color">自有厅（如为自有厅请打“√”）</td>
						<td rowspan="2" ><input type="text" class="inputStyle3" /></td>
						<td rowspan="2" class="field2_color">专营店（如为专营店请打“√”）</td>
						<td rowspan="2" ><input type="text" class="inputStyle3" /></td>
						<td colspan="4"  class="field2_color">如为新建乡镇网点需填写</td>
						<td rowspan="2" class="field2_color">是否为自有或自租物业</td>
						<td rowspan="2" ><input type="text" class="inputStyle3" /></td>
					 </tr>
					 <tr>
						<td class="field2_color">乡镇已有全网通卖场数</td>
						<td><input type="text" class="inputStyle3" /></td>
						<td class="field2_color">是否为全网通手机卖场</td>
						<td><input type="text" class="inputStyle3" /></td>
					 </tr>
					 
					 <tr>
					   <td rowspan="3"  class="field2_color">现有网点覆盖情况</td>
					   <td colspan="3" class="field2_color">自有厅数量</td>
					   <td colspan="3" class="field2_color">社会专营店数量</td>
					   <td colspan="3" class="field2_color">社会开放店数量</td>
					 </tr>
					 <tr>
						<td class="field2_color">电信</td>
						<td class="field2_color">移动</td>
						<td class="field2_color">联通</td>
						<td class="field2_color">电信</td>
						<td class="field2_color">移动</td>
						<td class="field2_color">联通</td>
						<td class="field2_color">电信</td>
						<td class="field2_color">移动</td>
						<td class="field2_color">联通</td>
					 </tr>
					 <tr>
						<td><input type="text" class="inputStyle3" /></td>
						<td><input type="text" class="inputStyle3" /></td>
						<td><input type="text" class="inputStyle3" /></td>
						<td><input type="text" class="inputStyle3" /></td>
						<td><input type="text" class="inputStyle3" /></td>
						<td><input type="text" class="inputStyle3" /></td>
						<td><input type="text" class="inputStyle3" /></td>
						<td><input type="text" class="inputStyle3" /></td>
						<td><input type="text" class="inputStyle3" /></td>
					 </tr>
					 <tr>
						<td class="field2_color">门店名称</td>
						<td colspan="2"><input type="text" class="inputStyle3" /></td>
						<td class="field2_color">门店地址</td>
						<td colspan="2"><input type="text" class="inputStyle3" /></td>
						<td class="field2_color">申请时间</td>
						<td><input type="text" class="inputStyle3" /></td>
						<td class="field2_color">预计建设完工时间</td>
						<td><input type="text" class="inputStyle3" /></td>
					 </tr>
					 <tr height="100">
						<td class="field2_color">建店原因（请用文字描述）</td>
						<td colspan="9"></td>
					 </tr>
					 <tr>
						<td class="field2_color" >预计月均收入(新增套餐套餐值的和)（元）</td>
						<td><input type="text" class="inputStyle3" /></td>
						<td class="field2_color" >预计月均放号量</td>
						<td><input type="text" class="inputStyle3" /></td>
						<td  class="field2_color">预计月均宽带发展量</td>
						<td><input type="text" class="inputStyle3" /></td>
						<td class="field2_color">预计月均ITV发展量</td>
						<td><input type="text" class="inputStyle3" /></td>
						<td  class="field2_color">资源投入回收期（填写月份）</td>
						<td><input type="text" class="inputStyle3" /></td>
					 </tr>
			</table>
		
</body>
</html>