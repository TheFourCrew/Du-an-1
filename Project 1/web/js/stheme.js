$(document).ready(function() {
    var offset = 220;
    var duration = 400;
    $(window).scroll(function() {
    if ($(this).scrollTop() > offset) {
        $('.float').css('display','block');
        $('.float').fadeIn(duration);
    } else {

        $('.float').fadeOut(duration);
    }
    });

    //scroll
    $('#top').click(function(event) {
    event.preventDefault();
    $('html, body').animate({scrollTop: 0}, duration);
    return false;
    })
});

$(document).ready(function(){
    $("#sbtn").click(function(){
        $(".inbt").animate({
            height: '28px',
            width: '175px',
        });
    });
    $(".inbt").mouseleave(function(){
        $(".inbt").animate({
            height: '28px',
            width: '0px',
        });
    });

});

$(document).ready(function(){
    var offset = 200;
    var offset2=550;
    var offset3 = 200;
    var duration = 1200;
    $(window).scroll(function() {
    if ($(this).scrollTop() > offset) {
    $('.map').fadeIn(duration);
    } else {
    $('.map').fadeOut(duration);
    }
    if ($(this).scrollTop() > offset2) {
    $('.dg').fadeIn(duration);
    } else {
    $('.dg').fadeOut(duration);
    }
    if ($(this).scrollTop()>0)
     {
        $('.topbar').fadeOut();
     }
    else
     {
      $('.topbar').fadeIn();
     }
    });
    
});