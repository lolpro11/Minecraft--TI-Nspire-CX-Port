package net.minecraft.src;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import net.minecraft.src.NetHandler;
import net.minecraft.src.Packet;

public class Packet204ClientInfo extends Packet {

   private String field_73468_a;
   private int field_73466_b;
   private int field_73467_c;
   private boolean field_73464_d;
   private int field_73465_e;


   public Packet204ClientInfo() {}

   public Packet204ClientInfo(String p_i3304_1_, int p_i3304_2_, int p_i3304_3_, boolean p_i3304_4_, int p_i3304_5_) {
      this.field_73468_a = p_i3304_1_;
      this.field_73466_b = p_i3304_2_;
      this.field_73467_c = p_i3304_3_;
      this.field_73464_d = p_i3304_4_;
      this.field_73465_e = p_i3304_5_;
   }

   public void func_73267_a(DataInputStream p_73267_1_) throws IOException {
      this.field_73468_a = func_73282_a(p_73267_1_, 7);
      this.field_73466_b = p_73267_1_.readByte();
      byte var2 = p_73267_1_.readByte();
      this.field_73467_c = var2 & 7;
      this.field_73464_d = (var2 & 8) == 8;
      this.field_73465_e = p_73267_1_.readByte();
   }

   public void func_73273_a(DataOutputStream p_73273_1_) throws IOException {
      func_73271_a(this.field_73468_a, p_73273_1_);
      p_73273_1_.writeByte(this.field_73466_b);
      p_73273_1_.writeByte(this.field_73467_c | (this.field_73464_d?1:0) << 3);
      p_73273_1_.writeByte(this.field_73465_e);
   }

   public void func_73279_a(NetHandler p_73279_1_) {
      p_73279_1_.func_72504_a(this);
   }

   public int func_73284_a() {
      return 0;
   }

   public String func_73459_d() {
      return this.field_73468_a;
   }

   public int func_73461_f() {
      return this.field_73466_b;
   }

   public int func_73463_g() {
      return this.field_73467_c;
   }

   public boolean func_73460_h() {
      return this.field_73464_d;
   }

   public int func_73462_i() {
      return this.field_73465_e;
   }

   public boolean func_73278_e() {
      return true;
   }

   public boolean func_73268_a(Packet p_73268_1_) {
      return true;
   }
}
