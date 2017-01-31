$(function(){
  
  var nests = 0;
  
  var elements = $(".info");
  
  elements.each(function(){
    var spanElement = $(this);
    spanElement.mouseover(function(){
      nests++;
    });
    spanElement.mouseout(function(){
      nests--;
    });
    
    var tooltipElementName = spanElement.attr("title");
    var tooltipElement = $('#'+tooltipElementName);
    tooltipElement.hide();
    spanElement.tooltip({
      delay:0,
      showURL:false,
      track: true,
      bodyHandler: function(){
        if(nests<=1){
          return tooltipElement.html();
        }
        return null;
      }
      
    });

  });
  
});
