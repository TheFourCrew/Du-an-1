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
<<<<<<< HEAD

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
=======
>>>>>>> origin/master
