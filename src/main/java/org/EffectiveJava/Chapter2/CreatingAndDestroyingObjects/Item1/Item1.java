package org.EffectiveJava.Chapter2.CreatingAndDestroyingObjects.Item1;

public class Item1 {

    /**
     * ITEM 1: Consider Static factory methods instead of constructors:
     *
     * Neden:
     *
     *  - Constructorlarda istediğiniz ismi vermek gibi bir seçeneğiniz olmaz.
     *
     *  - Durmadan yeni instance ürettiğimizde cacheleme gibi bir mekanizma kurma şansımız yok
     *
     *  - Constructorlar ile alt tipte veya farklı tipte bir obje üretemiyoruz.
     *
     *
     *  Static factory method nedir?  --- methodun önce static keywordünü alıp,
     *  aynı sınıfta bir instance döndürmesi lazım. mesela Boolean sınıfındaki valueOf methodu.
     *  (Static method sadece static değer döndürür.)
     *
     *
     * Ayrıca static methodlar static değer döndürdüğü için bellekte yeri ayrılmış oluyor.
     * Bu da doğru kullanımlarda bellek açısından iyi bir tasaruf sağlamış oluruz.
     *
     *   - Boolean örneği (valueOf)
     */
}
