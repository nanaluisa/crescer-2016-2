<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://code.jquery.com/jquery-3.1.1.min.js" 
                integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8="
                crossorigin="anonymous">
        </script>
        <title>Listagem - JSP Page</title>
    </head>
    <body>
   
        
        
   <form id="enviar">     
        
   <input type="text" id="nome"/>
   <button> </button>
   <script> 
       $.post(
            url:"/pessoa";
            data: $("$nome").val();
                    
                    
                //falta alguns comandos, .click....    
            )
        
   </script> 
   
        
   </form>    
        
        
    </body>
</html>

