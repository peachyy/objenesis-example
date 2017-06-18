import org.objenesis.Objenesis;
import org.objenesis.ObjenesisHelper;
import org.objenesis.ObjenesisStd;
import org.objenesis.instantiator.ObjectInstantiator;

/**
 * Created by xsTao on 2017/6/18.
 */
public class ExampleTest {
    public static void main(String[] args) {
        //Example aa=new Example();
        Objenesis objenesis = new ObjenesisStd(true);
        ObjectInstantiator thingyInstantiator = objenesis.getInstantiatorOf(Example.class);

        Example example1 = (Example)thingyInstantiator.newInstance();
        System.out.println("example1:"+example1+"---"+example1.getName());
        Example example2 = (Example)thingyInstantiator.newInstance();
        System.out.println("example2:"+example2+"---"+example2.getName());
        Example example3 = (Example)thingyInstantiator.newInstance();
        System.out.println("example3:"+example3+"---"+example3.getName());

        ///objenesis=new ObjenesisSerializer();

        Example example4 =objenesis.newInstance(Example.class);
        System.out.println("example4:"+example4+"----"+example4.getName());

        Example example5 = ObjenesisHelper.newInstance(Example.class);
        System.out.println("example5:" + example5 + "----" + example5.getName());
    }
}
