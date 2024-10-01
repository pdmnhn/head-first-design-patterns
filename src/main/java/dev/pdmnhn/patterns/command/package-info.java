/**
 * Pattern used in this chapter: <b> Command Pattern</b>,
 * The Command Pattern encapsulates a request as an object, thereby letting you parameterize other objects with
 * different requests, queue or log requests, and support undoable operations.
 * <p>
 * Pattern Honorable Mention: <b> Null Object </b>
 * A null object is useful when you don't have a meaningful object to return, and yet you want to remove the
 * responsibility for handling <b> null </b> from the client.
 * In {@link dev.pdmnhn.patterns.command.RemoteControl}, there wasn't a meaningful object to assign to each slot out
 * of the box, so a {@link dev.pdmnhn.patterns.command.NoCommand} object that acts as a surrogate and does nothing
 * when its {@link dev.pdmnhn.patterns.command.commands.Command#execute()} method is called.
 */
package dev.pdmnhn.patterns.command;
