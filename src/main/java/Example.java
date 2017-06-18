/**
 * Created by xsTao on 2017/6/18.
 */
public class Example  {

    private String name="没有无参构造函数";
//    public Example(){
//
//    }
    public Example(String name){
        System.out.println("创建了---"+Example.class.getName());
        this.name=name;
    }

    public String getName() {
        return this.name;
    }
}
