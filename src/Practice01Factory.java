/**
 * Practice 01 Factory
 * CS 245 - Part of the first practice assignment
 * A factory is a design pattern to swap in "moving parts" of an implementation.
 * In this case, it returns a class for either the iterative or recursive implementations.
 * @author dbrizan
 *
 */
public class Practice01Factory {

    public Practice01Math get(String mathtype) {
        if (mathtype.equalsIgnoreCase("recursive")) {
            return new Practice01MathRecursive();
        } else if (mathtype.equalsIgnoreCase("iterative")) {
            return new Practice01MathIterative();
        }
        return null;
    }
}
