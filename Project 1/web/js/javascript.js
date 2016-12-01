/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var loadFile = function (event, idthem) {
    var output = document.getElementById('output' + idthem + '');
    output.style.width = "300px";
    output.className = "img-thumbnail";
    if (this.URL) {
        output.src = URL.createObjectURL(event.target.files[0]);
    }
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
