<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <div class="be-content">
        <div class="page-head">
          <h2 class="page-head-title">Form Validation</h2>
          <nav aria-label="breadcrumb" role="navigation">
            <ol class="breadcrumb page-head-nav">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item"><a href="#">Forms</a></li>
              <li class="breadcrumb-item active">Validation</li>
            </ol>
          </nav>
        </div>
        <div class="main-content container-fluid">
          <div class="row">
            <div class="col-lg-12">
              <div class="card card-border-color card-border-color-primary">
                <div class="card-header card-header-divider">Basic Form<span class="card-subtitle">This is the default bootstrap form layout</span></div>
                <div class="card-body">
                  <form action="addblog"  method="POST" enctype="multipart/form-data" novalidate="">
                    <div class="form-group">
                      <label for="inputUserName">Title</label>
                      <input class="form-control" id="inputUserName" type="text" name="title" parsley-trigger="change" required="" placeholder="Enter title" autocomplete="off">
                    </div>
                    <div class="form-group">
                      <label for="inputEmail">Detail</label>
                      <input class="form-control" id="inputEmail" type="text" name="detail" parsley-trigger="change" required="" placeholder="Enter detail" autocomplete="off">
                    </div>
                   <div class="form-group">
                      <label for="inputUserName">Choose image</label>
                      <input class="form-control" name="image" type="file" id="file">
                    </div>
                    <div class="form-group">
                      <label for="inputRepeatPassword">Author</label>
                      <input class="form-control" id="inputRepeatPassword" name="author" data-parsley-equalto="#inputPassword" type="text" required="" placeholder="Author">
                    </div>
                    <div class="row pt-0 pt-sm-5">
                      <div class="col-sm-6 pb-2 pb-sm-4 pb-lg-0 pr-0">
                        <div class="be-checkbox custom-control custom-checkbox">
                          <input class="custom-control-input" type="checkbox" id="check1">
                          <label class="custom-control-label" for="check1">Remember me</label>
                        </div>
                      </div>
                      <div class="col-sm-6 pl-0">
                        <p class="text-right">
                          <button class="btn btn-space btn-primary" type="submit">Submit</button>
                          <button class="btn btn-space btn-secondary">Cancel</button>
                        </p>
                      </div>
                    </div>
                  </form>
                </div>
              </div>
            </div>
            
          </div>

          </div>
        </div>
      </div>
</body>
</html>