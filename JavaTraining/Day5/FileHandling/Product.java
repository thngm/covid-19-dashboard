package IOStreams;

import java.io.Serializable;

class Product implements Serializable {

    String name;
    String type;

    public Product(String name, String type) {
        this.name = name;
        this.type = type;
    }
}