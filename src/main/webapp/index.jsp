<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <script>
        function NavigateRestHostName() {

            var ctx = window.location.pathname.substring(0, window.location.pathname.indexOf("/", 2));
            var s = window.location.origin + ctx + "/rest/hostname";
            window.open(s);

        }


    </script>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Info</title>
    </head>
    <body>
        <h1>Information Restcall</h1>
        <div id="inputPanel">
            <br>
            <br>   
            <a id="myLink" title="navigate" href="javascript:void(0)" onclick="NavigateRestHostName();return false;">Rest call for hostname</a>
            <br>
        </div>
    </body>
</html>
