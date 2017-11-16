<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
// String path = "";
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
out.println(basePath);
%>
<!DOCTYPE html>
<html class="no-js">
<head>
<meta charset="UTF-8" />
<title>登录界面</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description"
	content="Login and Registration Form with HTML5 and CSS3" />
<meta name="keywords"
	content="html5, css3, form, switch, animation, :target, pseudo-class" />
<meta name="author" content="Codrops" />
<link rel="stylesheet" type="text/css" href="../css/demo.css" />
<link rel="stylesheet" type="text/css" href="../css/style.css" />
<link rel="stylesheet" type="text/css" href="../css/animate-custom.css" />
</head>
<body>
	<div class="container">
		<header>
			<h1>
<!-- 				Login and Registration Form <span>with HTML5 and CSS3</span> -->
			</h1>
		</header>
		<section>
			<div id="container_demo">
				<!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
				<a class="hiddenanchor" id="toregister"></a> <a class="hiddenanchor"
					id="tologin"></a>
				<div id="wrapper">
					<div id="login" class="animate form">
						<form action="<%=basePath%>LoginController/login" >
							<h1>Log in</h1>
							<p>
								<label for="username" class="uname" data-icon="u">用户名 </label> 
								<input id="username" name="username" required="required" type="text" placeholder="请输入用户名" />
							</p>
							<p>
								<label for="password" class="youpasswd" data-icon="p">密码</label>
								<input id="password" name="password" required="required" type="password" placeholder="密码" />
							</p>
							<p class="keeplogin">
								<input type="checkbox" name="loginkeeping" id="loginkeeping" value="loginkeeping" />
								<label for="loginkeeping">Keep 	me logged in</label>
							</p>
							<p class="login button">
								<input type="submit" value="登录" />
							</p>
							<p class="change_link">
								Not a member yet ?
								<a href="#toregister" class="to_register">Join us</a>
							</p>
						</form>
					</div>

					<div id="register" class="animate form">
						<form action="LoginController.register" autocomplete="on">
							<h1>Sign up</h1>
							<p>
								<label for="usernamesignup" class="uname" data-icon="u">用户名</label>
								<input id="usernamesignup" name="usernamesignup" required="required" type="text" placeholder="用户名" />
							</p>
							<p>
								<label for="emailsignup" class="youmail" data-icon="e">邮箱</label>
								<input id="emailsignup" name="emailsignup" required="required" type="email" placeholder="邮箱" />
							</p>
							<p>
								<label for="passwordsignup" class="youpasswd" data-icon="p">Your password </label>
								<input id="passwordsignup" name="passwordsignup" required="required" type="password" placeholder="密码" />
							</p>
							<p>
								<label for="passwordsignup_confirm" class="youpasswd" data-icon="p">Please confirm your password </label>
								<input id="passwordsignup_confirm" name="passwordsignup_confirm" required="required" type="password" placeholder="密码" />
							</p>
							<p class="signin button">
								<input type="submit" value="" />
							</p>
							<p class="change_link">
								Already a member ? 
								<a href="#tologin" class="to_register">Go and log in </a>
							</p>
						</form>
					</div>

				</div>
			</div>
		</section>
	</div>
	
	
	
<script>

</script>
</body>
</html>
