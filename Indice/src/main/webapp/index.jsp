<jsp:include page="header.jsp" /> 

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <div class="container-fluid">
            <div class="row mb-2">
                <div class="col-sm-12 text-center">
                    <h1>Calcular Indice</h1>
                </div>

            </div>
        </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">

        <!-- Default box -->
        <div class="card card-primary">
            <div class="card-header">
                <h3 class="card-title">Calcula indice</h3>
            </div>
            <!-- /.card-header -->
            <!-- form start -->
            <form method="post" action="Calcular">
                <div class="card-body">
                    <div class="row">
                        <div class="col-lg-4">
                            <div class="form-group">
                                <label >Curso 01</label>
                                <input type="text" name="nc1" class="form-control"  placeholder="Nombre del curso 01 " required>
                            </div>
                            <div class="form-group">
                                <input type="text" name="nc2" class="form-control"  placeholder="Nombre del curso 02" required>
                            </div>
                            <div class="form-group">
                                <input type="text" name="nc3" class="form-control"  placeholder="Nombre del curso 03" required>
                            </div>
                            <div class="form-group">
                                <input type="text" name="nc4" class="form-control"  placeholder="Nombre del curso 04" required>
                            </div>
                            <div class="form-group">
                                <input type="text" name="nc5" class="form-control"  placeholder="Nombre del curso 05" required>
                            </div>
                            <div class="form-group">
                                <input type="text" name="nc6" class="form-control"  placeholder="Nombre del curso 06" required>
                            </div>
                        </div>
                        <div class="col-lg-4">

                            <div class="form-group">
                                <label >Credito</label>
                                <input type="text" name="cc1" class="form-control"  placeholder="Credito del curso" required>
                            </div>
                            <div class="form-group">
                                <input type="text" name="cc2" class="form-control"  placeholder="Credito del curso" required>
                            </div>
                            <div class="form-group">
                                <input type="text" name="cc3" class="form-control"  placeholder="Credito del curso" required>
                            </div>
                            <div class="form-group">
                                <input type="text" name="cc4" class="form-control"  placeholder="Credito del curso" required>
                            </div>
                            <div class="form-group">
                                <input type="text" name="cc5" class="form-control"  placeholder="Credito del curso" required>
                            </div>
                            <div class="form-group">
                                <input type="text" name="cc6" class="form-control"  placeholder="Credito del curso" required>
                            </div>
                        </div>
                        <div class="col-lg-4">

                            <div class="form-group">
                                <label >Nota</label>
                                <input type="text" name="notac1" class="form-control"  placeholder="Nota del curso" required>
                            </div>
                            <div class="form-group">
                                <input type="text" name="notac2" class="form-control"  placeholder="Nota del curso" required>
                            </div>
                            <div class="form-group">
                                <input type="text" name="notac3" class="form-control"  placeholder="Nota del curso" required>
                            </div>
                            <div class="form-group">
                                <input type="text" name="notac4" class="form-control"  placeholder="Nota del curso" required>
                            </div>
                            <div class="form-group">
                                <input type="text" name="notac5" class="form-control"  placeholder="Nota del curso" required>
                            </div>
                            <div class="form-group">
                                <input type="text" name="notac6" class="form-control"  placeholder="Nota del curso" required>
                            </div>
                        </div>
                    </div>


                </div>
                <!-- /.card-body -->

                <div class="card-footer text-center">
                    <button type="submit" class="btn btn-primary">Calcular</button>
                </div>
            </form>
        </div>
        <!-- /.card -->

    </section>
    <!-- /.content -->
    <jsp:include page="footer.jsp" /> 