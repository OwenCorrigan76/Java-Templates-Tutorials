package interfaces;

// An interface is meant to be purely abstract and do not have state.
// Do not ave constructors, values of fields cannot be changed.
// Other classes implement instead of extend.

public interface Product {

    // fields are static and final (even if not specified).
    // cannot be private of protected
    // fields require a value at declaration because they are final
    String nameIs = "";
    // but we can omit the fields altogether and just provide methods

    String getName();
    void setName(String name);
}

// come back to default and static methods in interfaces.
