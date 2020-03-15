<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="header.jsp" /> 
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <div class="container-fluid">
            <div class="row mb-2">
                <div class="col-sm-12 text-center">
                    <h1> Indice</h1>
                </div>

            </div>
        </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">   
        <div class="card card-warning">
            <div class="card-header">
                <h3 class="card-title">Indice Academico</h3>
            </div>
            <!-- /.card-header -->
            <div class="card-body">
                <table class="table table-bordered">
                    <thead>                  
                        <tr>
                            <th style="width: 10px">#</th>
                            <th>Curso</th>
                            <th>Credito</th>
                            <th>Nota</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="listaver" begin="0" items="${listaCursos}">
                        <tr>
                          
                        <td>${listaver.count}</td>
                        <td>${listaver.nombre}</td>
                        <td>${listaver.credito}</td>
                        <td>${listaver.nota}</td>
                        </c:forEach>
                    </tbody>
                </table>
                <div class="text-center">
                    <h1>INDICE:</h1>
                    <h1>${respuesta}</h1> 
                </div>

            </div>
            <!-- /.card-body -->
            
        </div>

    </section>  
    <jsp:include page="footer.jsp" /> 
