package im.actor.model.api.updates;
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
import im.actor.model.api.*;

public class UpdateGroupUserLeave extends Update {

    public static final int HEADER = 0x17;
    public static UpdateGroupUserLeave fromBytes(byte[] data) throws IOException {
        return Bser.parse(new UpdateGroupUserLeave(), data);
    }

    private int groupId;
    private long rid;
    private int uid;
    private long date;

    public UpdateGroupUserLeave(int groupId, long rid, int uid, long date) {
        this.groupId = groupId;
        this.rid = rid;
        this.uid = uid;
        this.date = date;
    }

    public UpdateGroupUserLeave() {

    }

    public int getGroupId() {
        return this.groupId;
    }

    public long getRid() {
        return this.rid;
    }

    public int getUid() {
        return this.uid;
    }

    public long getDate() {
        return this.date;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.groupId = values.getInt(1);
        this.rid = values.getLong(4);
        this.uid = values.getInt(2);
        this.date = values.getLong(3);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeInt(1, this.groupId);
        writer.writeLong(4, this.rid);
        writer.writeInt(2, this.uid);
        writer.writeLong(3, this.date);
    }

    @Override
    public String toString() {
        String res = "update GroupUserLeave{";
        res += "groupId=" + this.groupId;
        res += ", rid=" + this.rid;
        res += ", uid=" + this.uid;
        res += ", date=" + this.date;
        res += "}";
        return res;
    }

    @Override
    public int getHeaderKey() {
        return HEADER;
    }
}
