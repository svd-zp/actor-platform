package im.actor.model.api;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.model.droidkit.bser.Bser;
import im.actor.model.droidkit.bser.BserParser;
import im.actor.model.droidkit.bser.BserObject;
import im.actor.model.droidkit.bser.BserValues;
import im.actor.model.droidkit.bser.BserWriter;
import im.actor.model.droidkit.bser.DataInput;
import static im.actor.model.droidkit.bser.Utils.*;
import java.io.IOException;
import im.actor.model.network.parser.*;
import java.util.List;
import java.util.ArrayList;

public class ServiceExChangedTitle extends ServiceEx {

    private String title;

    public ServiceExChangedTitle(String title) {
        this.title = title;
    }

    public ServiceExChangedTitle() {

    }

    public int getHeader() {
        return 5;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.title = values.getString(1);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        if (this.title == null) {
            throw new IOException();
        }
        writer.writeString(1, this.title);
    }

    @Override
    public String toString() {
        String res = "struct ServiceExChangedTitle{";
        res += "title=" + this.title;
        res += "}";
        return res;
    }

}
