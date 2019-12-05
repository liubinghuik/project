(function(){
      function b(t,u,s){
            this.t = t;
            this.u = u;
            this.c = s.color;
            this.m1();
      };
      b.prototype = {
            m1:function(){
                  var t = this;
                  t.d = false;
                  if(t.t.css('position') != 'fixed' && t.t.css('position') != 'absolute'){
                        t.t.css('position','relative');
                  }
                  t.w = t.t.width();
                  t.h = t.t.height();
                  t.t.children().each(function(){
                        if($(this).css('position') != 'fixed' && $(this).css('position') != 'absolute'){
                              $(this).css({'position':'relative','z-index':'2'});
                        }else if(parseInt($(this).css('z-index'))<2){
                              $(this).css({'z-index':'2'});
                        }
                  });
                  if(t.t.css('background-color') != "rgba(0, 0, 0, 0)"){
                        t.bc = t.t.css('background-color');
                  }else{
                        t.bc = '#ffffff';
                  }
                  t.t.append('<canvas width="'+t.w+'" height="'+t.h+'" style="position:absolute; top:0; left:0; z-index:1;"></canvas>');
                  t.ctx = t.t.children('canvas')[0].getContext('2d');
                  if(t.c === false){
                        t.t.mouseenter(function(){
                              t.c = 'hsl('+(Math.random()*360)+',60%,80%)';
                              t.ctx.fillStyle = t.c;
                        });
                  }else{
                        t.ctx.fillStyle = t.c;
                  };
                  t.t.mousemove(function(e){
                        t.x = e.pageX - t.t.offset().left-parseInt(t.t.css('border-left-width'));
                        t.y = e.pageY - t.t.offset().top-parseInt(t.t.css('border-top-width'));
                  });
                  t.a = [];
                  t.t.mouseenter(function(e){
                        t.f = true;
                        t.x = e.pageX - t.t.offset().left-parseInt(t.t.css('border-left-width'));
                        t.y = e.pageY - t.t.offset().top-parseInt(t.t.css('border-top-width'));
                        t.n1();
                  });
                  t.t.mouseleave(function(){
                        t.f = false;
                  });
                  t.ctx.clearRect(0,0,t.w,t.h);
            },
            n1:function(){
                  var t=this;
                  if(t.u<=0){
                        console.warn('请注意，没有第'+t.u+'个效果！！');
                        return false;
                  }
                  if(t.u<=10){
                        if(t.u == 1){
                              if(t.a.length == 0){
                                    t.x1(t);
                              }
                        }
                        else if(t.u == 2){
                              if(t.a.length == 0){
                                    t.x2(t);
                              }
                        }
                        else if(t.u == 3){
                              if(t.a.length == 0){
                                    t.x3(t);
                              }
                        }
                  }  else{
                        console.warn('请注意，没有第'+t.u+'个效果！！');
                  }
            },
            x1:function(t){
                  if(t.f){
                        t.a.push({x:t.x,y:t.y,r:2,o:1,c:t.c});
                  }
                  t.ctx.clearRect(0,0,t.w,t.h);
                  for(var i = 0;i<t.a.length;i++){
                        t.ctx.beginPath();
                        t.ctx.arc(t.a[i].x,t.a[i].y,t.a[i].r,0,Math.PI*2);
                        t.ctx.closePath();
                        t.ctx.globalAlpha = t.a[i].o;
                        t.ctx.fillStyle = t.a[i].c;
                        t.ctx.fill();
                        t.a[i].o-=.02;
                        t.a[i].r+=1;
                        if(t.a[i].o<=0){
                              t.a.splice(i,1);
                              i--;
                        }
                  }
                  t.ctx.globalAlpha = 1;
                  if(t.f || t.a.length>0){
                        requestAnimationFrame(function(){
                              t.x1(t);
                        });
                  }else{
                        t.ctx.clearRect(0,0,t.w,t.h);
                  }
            },
            x2:function(t){
                  if(t.f){
                        t.tan = Math.random()*3+1;
                        t.tan2 = Math.random()*Math.PI*2;
                        t.a.push({x:t.x,y:t.y,r:t.tan,c:t.c,t:t.tan2});
                  }
                  t.ctx.globalAlpha = 0.3;
                  t.ctx.fillStyle = t.bc;
                  t.ctx.fillRect(0,0,t.w,t.h);
                  for(var i = 0;i<t.a.length;i++){
                        t.ctx.beginPath();
                        t.ctx.arc(t.a[i].x,t.a[i].y,t.a[i].r,0,Math.PI*2);
                        t.ctx.closePath();
                        t.ctx.fillStyle = t.a[i].c;
                        t.ctx.fill();
                        t.a[i].x+=Math.cos(t.a[i].t);
                        t.a[i].y+=Math.sin(t.a[i].t);
                        if(t.a[i].y>t.a[i].r+t.h || t.a[i].y<-t.a[i].r || t.a[i].x<-t.a[i].r || t.a[i].x > t.a[i].r+t.w){
                              t.a.splice(i,1);
                              i--;
                        }
                  }
                  t.ctx.globalAlpha = 1;
                  if(t.f || t.a.length>0){
                        requestAnimationFrame(function(){
                              t.x2(t);
                        });
                  }else{
                        t.ctx.clearRect(0,0,t.w,t.h);
                  }
            },
            x3:function(t){
                  if(t.f){
                        t.tan = Math.random()*3+1;
                        t.tan2 = Math.random()*Math.PI*2;
                        t.a.push({x:Math.random()*t.w,y:Math.random()*t.h,r:t.tan,c:t.c,t:t.tan2});
                  }
                  t.ctx.globalAlpha = 0.3;
                  t.ctx.fillStyle = t.bc;
                  t.ctx.fillRect(0,0,t.w,t.h);
                  for(var i = 0;i<t.a.length;i++){
                        t.ctx.beginPath();
                        t.ctx.arc(t.a[i].x,t.a[i].y,t.a[i].r,0,Math.PI*2);
                        t.ctx.closePath();
                        t.ctx.fillStyle = t.a[i].c;
                        t.ctx.fill();
                        t.a[i].x+=Math.cos(t.a[i].t);
                        t.a[i].y+=Math.sin(t.a[i].t);
                        if(t.a[i].y>t.a[i].r+t.h || t.a[i].y<-t.a[i].r || t.a[i].x<-t.a[i].r || t.a[i].x > t.a[i].r+t.w){
                              t.a.splice(i,1);
                              i--;
                        }
                  }
                  t.ctx.globalAlpha = 1;
                  if(t.f || t.a.length>0){
                        requestAnimationFrame(function(){
                              t.x3(t);
                        });
                  }else{
                        t.ctx.clearRect(0,0,t.w,t.h);
                  }
            }
      };
      var y = {
            color:false,
      };
      $.fn.xs999 = function(u,g){
            y = {
                  color:false,
            }
            $.extend(y,g);
            $(this).each(function() {
                  new b($(this),u,y);
            });
      }
})(jQuery);