package edu.cnm.deepdive;

import java.util.Random;

/**
 *Simple array shuffling class. Since {@Link java.util.Arrays} does not implement a {code shuffle}
 * method (the {@link java.util.Collection} class code), this addresses that with a basic
 * implementation of the Fisher-Yates shuffling algorithm.
 */
public class Shuffler {

  private final Random rng;

  /**
   * Initializes this instance with the provided source of (pseudo- )randomness.*
   * @param rng random number generator.
   */
  public Shuffler(Random rng) {
    this.rng = rng;
  }

  /**
   * Shuffles {@code data} in place.*
   * @param data random number generator.
   */

  public void shuffle(int[] data) {
    for (int dest = data.length - 1; dest > 0; dest--) {
      int source = rng.nextInt(dest + 1);
      int temp = data[dest];
      data[dest] = data[source];
      data[source] = temp;
    }
  }

  /**
   * Shuffles{@code data} in place*
   * @param data random number generator.
   */

  public void shuffle(byte[] data) {
    for (int dest = data.length - 1; dest > 0; dest--) {
      int source = rng.nextInt(dest + 1);
      byte temp = data[dest];
      data[dest] = data[source];
      data[source] = temp;
    }
  }

  /**
   * Shuffles {data code} in place.*
   * @param data random number generator.
   */

  public void shuffle(char[] data) {
    for (int dest = data.length - 1; dest > 0; dest--) {
      int source = rng.nextInt(dest + 1);
      char temp = data[dest];
      data[dest] = data[source];
      data[source] = temp;
    }
  }

  /**
   * Shuffles {code data} in place.*
   * @param data random number generator.
   */

  public void shuffle(short[] data) {
    for (int dest = data.length - 1; dest > 0; dest--) {
      int source = rng.nextInt(dest + 1);
      short temp = data[dest];
      data[dest] = data[source];
      data[source] = temp;
    }
  }

  /**
   * Shuffles {code data} in place.*
   * @param data random number generator.
   */

  public void shuffle(long[] data) {
    for (int dest = data.length - 1; dest > 0; dest--) {
      int source = rng.nextInt(dest + 1);
      long temp = data[dest];
      data[dest] = data[source];
      data[source] = temp;
    }
  }

  /**
   * Shuffles {code data} in place.
   * @param data random number generator.
   */

  public void shuffle(float[] data) {
    for (int dest = data.length - 1; dest > 0; dest--) {
      int source = rng.nextInt(dest + 1);
      float temp = data[dest];
      data[dest] = data[source];
      data[source] = temp;
    }
  }

  /**
   * Shuffles {@code data} in place.
   * @param data random number generator.
   */

  public void shuffle(double[] data) {
    for (int dest = data.length - 1; dest > 0; dest--) {
      int source = rng.nextInt(dest + 1);
      double temp = data[dest];
      data[dest] = data[source];
      data[source] = temp;
    }
  }

  /**
   * Shuffles {code data} in place.
   * @param data random number generator.
   * @param <T>
   */

  public <T> void shuffle(T[] data) {
    for (int dest = data.length - 1; dest > 0; dest--) {
      int source = rng.nextInt(dest + 1);
      T temp = data[dest];
      data[dest] = data[source];
      data[source] = temp;
    }
  }
}
