/**
 * Design Principles,
 * <p>
 * 1. Dependency Inversion: Depend upon abstractions. Do not depend upon concrete classes.
 * <p>
 * Pattern used in this chapter: <b>Factory Method Pattern</b> and it's different variants are
 * 1. Simple factory which encapsulates object creation while not a bona fide design pattern, is a simple way to
 * decouple your clients from concrete classes.
 * <p>
 * 2. The factory method pattern defines an interface for creating an object, but lets subclasses decide which class to
 * instantiate. Factory method lets a class defer instantiation to subclasses.
 * <p>
 * 3. The abstract factory pattern provides an interface for creating families of related or dependent objects without
 * specifying their concrete classes.
 */
package dev.pdmnhn.patterns.factory;
