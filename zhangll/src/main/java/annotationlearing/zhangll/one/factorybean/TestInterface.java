package annotationlearing.zhangll.one.factorybean;

public interface TestInterface {
    default boolean istrue() {
        return true;
    }

    static boolean isfalse() {
        return false;
    }
}