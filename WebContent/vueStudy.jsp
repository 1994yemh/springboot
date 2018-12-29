<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="js/vue.min.js"></script>
<style>

</style>

</head>
<body>
    <div id="app">
    <my-test></my-test>
  <p>{{ message }}</p>
  <p  v-for="site in sites">   {{ site.name }}</p>

  <ul>
    <li v-for="n in [1,3,5]">
     {{ n }}
    </li>
  </ul>
</div>

</body>
</html>
<script>
var myTest={
		
		template:'<p>this is my test</p>',
};
new Vue({
	  el: '#app',
	  data: {
		    sites: [
		      { name: 'Runoob' },
		      { name: 'Google' },
		      { name: 'Taobao' }
		    ],
            message: 'Hello Vue.js!'
		  },
		 components: {
			  'my-test':myTest
		  }
	});

</script>