<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/5/17 0017
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script src="js/jquery_3.5.1.js"></script>

    <script>

        function login() {
            console.info(11111);
            location.href="reg/a/sfff/lg2.do?name=sss";
            /*$.ajax({
                url:'reg/lg.do',
                method:'post',
                data:{name:'abc',pass:'123'},
                dataType:'json',
                success:function (dt) {
                    console.info(dt);
                    // var js = eval("("+dt+")");
                    console.info(dt.k1);
                }
            });*/
        }

    </script>

</head>
<body>

    <input onclick="login()" type="button" value="登录"/>

</body>
</html>
