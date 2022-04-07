package CardGameLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_Action;
  private ConceptPresentation props_And;
  private ConceptPresentation props_Card;
  private ConceptPresentation props_Collection;
  private ConceptPresentation props_Command;
  private ConceptPresentation props_Deck;
  private ConceptPresentation props_Empty;
  private ConceptPresentation props_Game;
  private ConceptPresentation props_IntValue;
  private ConceptPresentation props_Kamu;
  private ConceptPresentation props_LogicalExpression;
  private ConceptPresentation props_Move;
  private ConceptPresentation props_MoveAll;
  private ConceptPresentation props_MoveSelected;
  private ConceptPresentation props_Not;
  private ConceptPresentation props_Operator;
  private ConceptPresentation props_Optional;
  private ConceptPresentation props_Or;
  private ConceptPresentation props_Phase;
  private ConceptPresentation props_Pile;
  private ConceptPresentation props_Player;
  private ConceptPresentation props_Property;
  private ConceptPresentation props_Select;
  private ConceptPresentation props_SelectCard;
  private ConceptPresentation props_SelectPile;
  private ConceptPresentation props_Shuffle;
  private ConceptPresentation props_StringValue;
  private ConceptPresentation props_Token;
  private ConceptPresentation props_Turn;
  private ConceptPresentation props_Value;
  private ConceptPresentation props_While;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.Action:
        if (props_Action == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Action = cpb.create();
        }
        return props_Action;
      case LanguageConceptSwitch.And:
        if (props_And == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("and");
          props_And = cpb.create();
        }
        return props_And;
      case LanguageConceptSwitch.Card:
        if (props_Card == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Card = cpb.create();
        }
        return props_Card;
      case LanguageConceptSwitch.Collection:
        if (props_Collection == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Collection = cpb.create();
        }
        return props_Collection;
      case LanguageConceptSwitch.Command:
        if (props_Command == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Command = cpb.create();
        }
        return props_Command;
      case LanguageConceptSwitch.Deck:
        if (props_Deck == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Deck = cpb.create();
        }
        return props_Deck;
      case LanguageConceptSwitch.Empty:
        if (props_Empty == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("empty");
          props_Empty = cpb.create();
        }
        return props_Empty;
      case LanguageConceptSwitch.Game:
        if (props_Game == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Game = cpb.create();
        }
        return props_Game;
      case LanguageConceptSwitch.IntValue:
        if (props_IntValue == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Number");
          props_IntValue = cpb.create();
        }
        return props_IntValue;
      case LanguageConceptSwitch.Kamu:
        if (props_Kamu == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("kamu");
          props_Kamu = cpb.create();
        }
        return props_Kamu;
      case LanguageConceptSwitch.LogicalExpression:
        if (props_LogicalExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_LogicalExpression = cpb.create();
        }
        return props_LogicalExpression;
      case LanguageConceptSwitch.Move:
        if (props_Move == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Move a given number of cards");
          cpb.rawPresentation("move");
          props_Move = cpb.create();
        }
        return props_Move;
      case LanguageConceptSwitch.MoveAll:
        if (props_MoveAll == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Move all moves all cards between two piles");
          cpb.rawPresentation("move all");
          props_MoveAll = cpb.create();
        }
        return props_MoveAll;
      case LanguageConceptSwitch.MoveSelected:
        if (props_MoveSelected == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("move selected");
          props_MoveSelected = cpb.create();
        }
        return props_MoveSelected;
      case LanguageConceptSwitch.Not:
        if (props_Not == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("not");
          props_Not = cpb.create();
        }
        return props_Not;
      case LanguageConceptSwitch.Operator:
        if (props_Operator == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Operator");
          props_Operator = cpb.create();
        }
        return props_Operator;
      case LanguageConceptSwitch.Optional:
        if (props_Optional == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("optional");
          props_Optional = cpb.create();
        }
        return props_Optional;
      case LanguageConceptSwitch.Or:
        if (props_Or == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("or");
          props_Or = cpb.create();
        }
        return props_Or;
      case LanguageConceptSwitch.Phase:
        if (props_Phase == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("A set of Actions");
          cpb.presentationByName();
          props_Phase = cpb.create();
        }
        return props_Phase;
      case LanguageConceptSwitch.Pile:
        if (props_Pile == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Pile = cpb.create();
        }
        return props_Pile;
      case LanguageConceptSwitch.Player:
        if (props_Player == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Player = cpb.create();
        }
        return props_Player;
      case LanguageConceptSwitch.Property:
        if (props_Property == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("property");
          props_Property = cpb.create();
        }
        return props_Property;
      case LanguageConceptSwitch.Select:
        if (props_Select == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("select");
          props_Select = cpb.create();
        }
        return props_Select;
      case LanguageConceptSwitch.SelectCard:
        if (props_SelectCard == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("select card");
          props_SelectCard = cpb.create();
        }
        return props_SelectCard;
      case LanguageConceptSwitch.SelectPile:
        if (props_SelectPile == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("select pile");
          props_SelectPile = cpb.create();
        }
        return props_SelectPile;
      case LanguageConceptSwitch.Shuffle:
        if (props_Shuffle == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Shuffle is an Action which manipulates an existing Deck");
          cpb.rawPresentation("shuffle");
          props_Shuffle = cpb.create();
        }
        return props_Shuffle;
      case LanguageConceptSwitch.StringValue:
        if (props_StringValue == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Text");
          props_StringValue = cpb.create();
        }
        return props_StringValue;
      case LanguageConceptSwitch.Token:
        if (props_Token == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Token = cpb.create();
        }
        return props_Token;
      case LanguageConceptSwitch.Turn:
        if (props_Turn == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("turn");
          props_Turn = cpb.create();
        }
        return props_Turn;
      case LanguageConceptSwitch.Value:
        if (props_Value == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Value = cpb.create();
        }
        return props_Value;
      case LanguageConceptSwitch.While:
        if (props_While == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("while");
          props_While = cpb.create();
        }
        return props_While;
    }
    return null;
  }
}
