// File: src/main/java/org/example/services/IManageable.java
package org.example.services;

import org.example.models.Item;

public interface IManageble {
    void add(Item item);
    void remove(Item item);
    void listAvailable();
    void listBorrowed();
}
