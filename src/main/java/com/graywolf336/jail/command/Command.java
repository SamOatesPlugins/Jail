package com.graywolf336.jail.command;

import org.bukkit.command.CommandSender;

import com.graywolf336.jail.JailManager;

/**
 * The base of all the commands.
 * 
 * @author graywolf336
 * @since 3.0.0
 * @version 1.0.0
 */
public interface Command {
    /**
     * Execute the command given the arguments, returning whether the command handled it or not.
     * 
     * <p>
     * 
     * When the method returns false, the usage message is printed to the sender. If the method
     * handles the command in any way, such as sending a message to the sender or actually doing
     * something, then it should return true so that the sender of the command doesn't get the
     * usage message.
     * 
     * @param jm An instance of the {@link JailManager}
     * @param sender The {@link CommandSender sender} of the command
     * @param args The args, in an array
     * @return True if the method handled it in any way, false if we should send the usage message.
     */
    public boolean execute(JailManager jm, CommandSender sender, String... args) throws Exception;
}
