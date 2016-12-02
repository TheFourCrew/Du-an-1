/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var loadFile = function (event, idthem) {
    var output = document.getElementById('output' + idthem + '');
    output.style.width = "300px";
    output.className = "img-thumbnail";

    output.src = URL.createObjectURL(event.target.files[0]);
};
$(function () {
    function previewImages() {

        var preview = $('#gallery').empty();
        if (this.files)
            $.each(this.files, readAndPreview);

        function readAndPreview(i, file) {

            if (!/\.(jpe?g|png|gif)$/i.test(file.name)) {
                return alert(file.name + " is not an image");
            } // else...

            var reader = new FileReader();

            $(reader).on("load", function () {
                preview.append($("<img/>", {
                    src: this.result, height: 100, class: 'img-thumbnail', title: file.name
                }));
            });
            reader.readAsDataURL(file);
        }
    }
    $('#prod-images').on("change", previewImages);
});

///Hàm kiểm tra đăng nhập

$(window).ready(function () {
    $('#addproduct').validate({
        onchange: true,
        rules: {
            'prod-name': "required",
            'prod-describe': "required",
            'prod-price': {
                required: true,
                number: true,
                digits: true
            },
            'prod-quantity': {
                required: true,
                number: true,
                digits: true
            },
            'prod-unit': "required",
            'loaiSP': "required",
            'prod-thumbnail': "required"
        },
        messages: {
            'prod-name': "Vui lòng nhập tên sản phẩm.",
            'prod-describe': "Vui lòng nhập mô tả.",
            'prod-price': {
                required: "Vui lòng nhập giá.",
                number: "Giá chỉ có số.",
                digits: "Giá phải trên 0."
            },
            'prod-quantity': {
                required: "Vui lòng nhập số lượng.",
                number: "Giá chỉ có số.",
                digits: "Số lượng phải trên 0."
            },
            'prod-unit': "Vui lòng nhập đơn vị.",
            'loaiSP': "Vui lòng chọn loại sản phẩm.",
            'prod-thumbnail': "Vui lòng chọn hình đại diện."
        }
    });
});
$(window).ready(function () {
    $('#edituser').validate({
        onchange: true,
        rules: {
            'username':{
                required:true,
                minlength:6,
            },
            'password':{
                required:true,
                minlength:6,
            },
            'repassword':{
                required:true,
                equalto:"#password",
            },
            'role':'required',
            'fullname':'required',
            'dienthoai':{
                required:true,
                number:true,
                minlength:10,
                maxlength:11,
            },
            'address':'required',
            'email':{
                required:true,
                email:true,
            },
        },
        messages: {
            'username':{
                required:"Bạn chưa nhập tên đăng nhập",
                minlength:'Tên đăng nhập chưa đủ 6 ký tự',
            },
            'password':{
                required:"Bạn chưa nhập mật khẩu",
                minlength:'Mật khẩu chưa đủ 6 ký tự',
            },
            'repassword':{
                required:'Vui lòng nhập lại mật khẩu',
                equaTo:"Mật khẩu nhập lại sai",
            },
            'role':'Vui lòng chọn quyền',
            'fullname':'Bạn chưa nhập họ tên ',
            'dienthoai':{
                required:'Chưa nhập điện thoại',
                number:'Điện thoại chỉ có số',
                minlength:'Số điện thoại không hợp lệ',
                maxlength:'Số điện thoại không hợp lệ',
            },
            'address':'Bạn chưa nhập địa chỉ',
            'email':{
                required:'Chưa nhập email',
                email:'Email không hợp lệ',
            },
        }
    });
});