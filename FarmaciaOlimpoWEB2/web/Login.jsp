<%-- 
    Document   : Login
    Created on : 29/05/2022, 07:44:51 PM
    Author     : jarvi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Recursos/css/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="Recursos/css/bootstrap-grid.min.css" rel="stylesheet" type="text/css"/>
        <link href="Recursos/css/bootstrap-grid.rtl.css" rel="stylesheet" type="text/css"/>
        <link href="Recursos/css/bootstrap-grid.rtl.min.css" rel="stylesheet" type="text/css"/>
        <link href="Recursos/css/bootstrap-reboot.min.css" rel="stylesheet" type="text/css"/>
        <link href="Recursos/css/bootstrap-reboot.rtl.min.css" rel="stylesheet" type="text/css"/>
        <link href="Recursos/css/bootstrap-reboot.rtl.css" rel="stylesheet" type="text/css"/>
        <link href="Recursos/css/bootstrap-utilities.css" rel="stylesheet" type="text/css"/>
        <link href="Recursos/css/bootstrap-reboot.css" rel="stylesheet" type="text/css"/>
        <link href="Recursos/css/bootstrap-utilities.min.css" rel="stylesheet" type="text/css"/>
        <link href="Recursos/css/bootstrap-utilities.rtl.css" rel="stylesheet" type="text/css"/>
        <link href="Recursos/css/bootstrap-utilities.rtl.min.css" rel="stylesheet" type="text/css"/>
        <link href="Recursos/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="Recursos/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="Recursos/css/bootstrap.rtl.css" rel="stylesheet" type="text/css"/>
        <link href="Recursos/css/bootstrap.rtl.min.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <section class="h-100 gradient-form" style="background-color: #eee;">
            <div class="container py-5 h-100">
                <div class="row d-flex justify-content-center align-items-center h-100">
                    <div class="col-xl-5">
                        <div class="card rounded-3 text-black">
                            <div class="row g-0">
                                <div class="col-lg-0">
                                    <div class="card-body p-md-5 mx-md-4">

                                        <div class="text-center">
                                            <img src="Recursos/imagenes/LOGO FARMACIA OLIMPO VERTICAL .png"
                                                 style="width: 185px;" alt="logo">
                                        </div>
                                        <form action="Login.jsp" method="post" >
                                            <p class="text-center">Ingresa tu usuario y contraseña</p>

                                            <div class="form-outline mb-4 ml-10">
                                                <label class="form-label" for="usuario">Usuario</label>
                                                <input type="text" id="usuario" name="usuario" class="form-control" placeholder="Ingresa tu usuario" />
                                            </div>

                                            <div class="form-outline mb-4">
                                                <label class="form-label" for="contra">Contraseña</label>
                                                <input type="password" id="contra"  name="contra" class="form-control" placeholder="Ingresa tu contraseña"/>
                                            </div>

                                            <div class="text-center pt-1 mb-5 pb-1">
                                                <button type="submit" class="btn btn-primary btn-block">Ingresar</button>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <footer class="bg-light text-center align-bottom">
        <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
            © 2022 Copyright:
        </div>

    </footer>
</body>
</html>
