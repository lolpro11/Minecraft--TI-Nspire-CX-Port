package net.minecraft.src;

import net.minecraft.src.EnumGameType;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.WorldInfo;
import net.minecraft.src.WorldType;

public class DerivedWorldInfo extends WorldInfo {

   private final WorldInfo field_76115_a;


   public DerivedWorldInfo(WorldInfo p_i3911_1_) {
      this.field_76115_a = p_i3911_1_;
   }

   public NBTTagCompound func_76066_a() {
      return this.field_76115_a.func_76066_a();
   }

   public NBTTagCompound func_76082_a(NBTTagCompound p_76082_1_) {
      return this.field_76115_a.func_76082_a(p_76082_1_);
   }

   public long func_76063_b() {
      return this.field_76115_a.func_76063_b();
   }

   public int func_76079_c() {
      return this.field_76115_a.func_76079_c();
   }

   public int func_76075_d() {
      return this.field_76115_a.func_76075_d();
   }

   public int func_76074_e() {
      return this.field_76115_a.func_76074_e();
   }

   public long func_76073_f() {
      return this.field_76115_a.func_76073_f();
   }

   public NBTTagCompound func_76072_h() {
      return this.field_76115_a.func_76072_h();
   }

   public int func_76076_i() {
      return this.field_76115_a.func_76076_i();
   }

   public String func_76065_j() {
      return this.field_76115_a.func_76065_j();
   }

   public int func_76088_k() {
      return this.field_76115_a.func_76088_k();
   }

   public boolean func_76061_m() {
      return this.field_76115_a.func_76061_m();
   }

   public int func_76071_n() {
      return this.field_76115_a.func_76071_n();
   }

   public boolean func_76059_o() {
      return this.field_76115_a.func_76059_o();
   }

   public int func_76083_p() {
      return this.field_76115_a.func_76083_p();
   }

   public EnumGameType func_76077_q() {
      return this.field_76115_a.func_76077_q();
   }

   public void func_76068_b(long p_76068_1_) {}

   public void func_76081_a(int p_76081_1_, int p_76081_2_, int p_76081_3_) {}

   public void func_76062_a(String p_76062_1_) {}

   public void func_76078_e(int p_76078_1_) {}

   public void func_76069_a(boolean p_76069_1_) {}

   public void func_76090_f(int p_76090_1_) {}

   public void func_76084_b(boolean p_76084_1_) {}

   public void func_76080_g(int p_76080_1_) {}

   public boolean func_76089_r() {
      return this.field_76115_a.func_76089_r();
   }

   public boolean func_76093_s() {
      return this.field_76115_a.func_76093_s();
   }

   public WorldType func_76067_t() {
      return this.field_76115_a.func_76067_t();
   }

   public void func_76085_a(WorldType p_76085_1_) {}

   public boolean func_76086_u() {
      return this.field_76115_a.func_76086_u();
   }

   public boolean func_76070_v() {
      return this.field_76115_a.func_76070_v();
   }

   public void func_76091_d(boolean p_76091_1_) {}
}
