package cn.itcast.annotation;

@MyAnno(value = 12,per = Person.p1,anno2 = @MyAnno2,strs="abc")
@MyAnno3
public class Worker {

    @MyAnno3
    public String name = "aaa";
    @MyAnno3
    public void show(){

    }
}
