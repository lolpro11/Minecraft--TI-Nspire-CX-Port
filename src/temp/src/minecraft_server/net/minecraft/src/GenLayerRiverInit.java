package net.minecraft.src;

import net.minecraft.src.GenLayer;
import net.minecraft.src.IntCache;

public class GenLayerRiverInit extends GenLayer {

   public GenLayerRiverInit(long p_i3893_1_, GenLayer p_i3893_3_) {
      super(p_i3893_1_);
      this.field_75909_a = p_i3893_3_;
   }

   public int[] func_75904_a(int p_75904_1_, int p_75904_2_, int p_75904_3_, int p_75904_4_) {
      int[] var5 = this.field_75909_a.func_75904_a(p_75904_1_, p_75904_2_, p_75904_3_, p_75904_4_);
      int[] var6 = IntCache.func_76445_a(p_75904_3_ * p_75904_4_);

      for(int var7 = 0; var7 < p_75904_4_; ++var7) {
         for(int var8 = 0; var8 < p_75904_3_; ++var8) {
            this.func_75903_a((long)(var8 + p_75904_1_), (long)(var7 + p_75904_2_));
            var6[var8 + var7 * p_75904_3_] = var5[var8 + var7 * p_75904_3_] > 0?this.func_75902_a(2) + 2:0;
         }
      }

      return var6;
   }
}
