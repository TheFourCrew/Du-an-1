/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var loadFile = function (event, idthem) {
    var output = document.getElementById('output' + idthem + '');
    output.style.width = "200px";
    output.className = "img-response";

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
            'prod-thumbnail': {
                required: true,
                extension: "jpg|png|gif|jpeg"
            }
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
            'prod-thumbnail': {
                required: "Vui lòng chọn hình đại diện.",
                extension: "Ảnh sẽ có đuôi *.jpg, *.jpeg, *.gif hoặc *.png"
            }
        }
    });
});

//Hàm kiểm tra nhập email
$(window).ready(function () {
    $('#form-contact').validate({
        onchange: true,
        rules: {
            'cName': "required",
            'cSubject': "required",
            'cEmail': {
                required: true,
                email: true
            },
            'cMessage': {
                required: true,
                minlength: 20
            }
        },
        messages: {
            'cName': "Vui lòng nhập họ tên.",
            'cSubject': "Vui lòng nhập tiêu đề.",
            'cEmail': {
                required: "Vui lòng nhập email người gửi.",
                email: "Email không hợp lệ"
            },
            'cMessage': {
                required: "Vui lòng nhập lời nhắn.",
                minlength: "Vui lòng nhập ít nhất 20 kí tự"
            }
        }
    });
});

$(window).ready(function () {
    $('#edituser').validate({
        onchange: true,
        rules: {
            'username': {
                required: true,
                minlength: 6
            },
            'password': {
                required: true,
                minlength: 6
            },
            'repassword': {
                required: true,
                equalTo: "#password"
            },
            'role': 'required',
            'fullname': 'required',
            'dienthoai': {
                required: true,
                number: true,
                minlength: 10,
                maxlength: 11
            },
            'address': 'required',
            'email': {
                required: true,
                email: true
            }
        },
        messages: {
            'username': {
                required: "Bạn chưa nhập tên đăng nhập",
                minlength: 'Tên đăng nhập chưa đủ 6 ký tự'
            },
            'password': {
                required: "Bạn chưa nhập mật khẩu",
                minlength: 'Mật khẩu chưa đủ 6 ký tự'
            },
            'repassword': {
                required: 'Vui lòng nhập lại mật khẩu',
                equalTo: "Mật khẩu nhập lại sai"
            },
            'role': 'Vui lòng chọn quyền',
            'fullname': 'Bạn chưa nhập họ tên ',
            'dienthoai': {
                required: 'Chưa nhập điện thoại',
                number: 'Điện thoại chỉ có số',
                minlength: 'Số điện thoại không hợp lệ',
                maxlength: 'Số điện thoại không hợp lệ'
            },
            'address': 'Bạn chưa nhập địa chỉ',
            'email': {
                required: 'Chưa nhập email',
                email: 'Email không hợp lệ'
            }
        }
    });
});