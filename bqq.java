import org.lwjgl.util.vector.Matrix4f;

public class bqq
  extends Matrix4f
{
  public bqq(float[] ☃)
  {
    m00 = ☃[0];
    m01 = ☃[1];
    m02 = ☃[2];
    m03 = ☃[3];
    m10 = ☃[4];
    m11 = ☃[5];
    m12 = ☃[6];
    m13 = ☃[7];
    m20 = ☃[8];
    m21 = ☃[9];
    m22 = ☃[10];
    m23 = ☃[11];
    m30 = ☃[12];
    m31 = ☃[13];
    m32 = ☃[14];
    m33 = ☃[15];
  }
  
  public bqq()
  {
    m00 = (m01 = m02 = m03 = m10 = m11 = m12 = m13 = m20 = m21 = m22 = m23 = m30 = m31 = m32 = m33 = 0.0F);
  }
}
