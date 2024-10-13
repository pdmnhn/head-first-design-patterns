/**
 * Design Principles,
 *  * <p>
 *  * 1. The Hollywood Principle: Don't call us, we'll call you.
 * <p>
 *  It provides a way to prevent "dependency rot". It allows low-level components to hook themselves into a system,
 *  but the high-level components determine when they are needed, and how.
 *  A low-level component never calls a high-level component directly.
 *  * <p>
 * Pattern used in this chapter: <b> Template Method Pattern</b>,
 * The template method pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
 * Template method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
 */
package dev.pdmnhn.patterns.templatemethod;
