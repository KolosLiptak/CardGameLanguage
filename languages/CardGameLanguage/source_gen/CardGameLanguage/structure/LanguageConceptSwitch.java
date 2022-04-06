package CardGameLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int Card = 0;
  public static final int Deck = 1;
  public static final int IntValue = 2;
  public static final int Pile = 3;
  public static final int Player = 4;
  public static final int Property = 5;
  public static final int StringValue = 6;
  public static final int Token = 7;
  public static final int Value = 8;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0xe94dfae4e9d04770L, 0x965c58db5e543504L);
    builder.put(0x568258613b824594L, Card);
    builder.put(0x568258613b8467c7L, Deck);
    builder.put(0x568258613b82ce75L, IntValue);
    builder.put(0x39b65bcfb2f83152L, Pile);
    builder.put(0x39b65bcfb2f7900fL, Player);
    builder.put(0x568258613b82e0a7L, Property);
    builder.put(0x568258613b82ce76L, StringValue);
    builder.put(0x568258613b824595L, Token);
    builder.put(0x568258613b82ce7bL, Value);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
