package de.protos.FlowOfWork.core.fow.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.protos.FlowOfWork.core.fow.services.FoWGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFoWParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Role'", "';'", "'WorkProductType'", "'WorkProduct'", "':'", "'GuidanceType'", "'Guidance'", "'State'", "'('", "')'", "'Activity'", "'responsible'", "'inputs'", "','", "'outputs'", "'subActivities'", "'guidances'", "'Behavior'", "'{'", "'}'", "'Decision'", "'Step'", "'Transition'", "'initial'", "'to'", "'final'", "'label'", "'summary'", "'description'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalFoWParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFoWParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFoWParser.tokenNames; }
    public String getGrammarFileName() { return "../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g"; }



     	private FoWGrammarAccess grammarAccess;
     	
        public InternalFoWParser(TokenStream input, FoWGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected FoWGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_activities_0_0= ruleActivity ) ) | ( (lv_roles_1_0= ruleRole ) ) | ( (lv_workProducts_2_0= ruleWorkProduct ) ) | ( (lv_workProductTypes_3_0= ruleWorkProductType ) ) | ( (lv_guidances_4_0= ruleGuidance ) ) | ( (lv_guidanceTypes_5_0= ruleGuidanceType ) ) | ( (lv_states_6_0= ruleState ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_activities_0_0 = null;

        EObject lv_roles_1_0 = null;

        EObject lv_workProducts_2_0 = null;

        EObject lv_workProductTypes_3_0 = null;

        EObject lv_guidances_4_0 = null;

        EObject lv_guidanceTypes_5_0 = null;

        EObject lv_states_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:79:28: ( ( ( (lv_activities_0_0= ruleActivity ) ) | ( (lv_roles_1_0= ruleRole ) ) | ( (lv_workProducts_2_0= ruleWorkProduct ) ) | ( (lv_workProductTypes_3_0= ruleWorkProductType ) ) | ( (lv_guidances_4_0= ruleGuidance ) ) | ( (lv_guidanceTypes_5_0= ruleGuidanceType ) ) | ( (lv_states_6_0= ruleState ) ) )* )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:80:1: ( ( (lv_activities_0_0= ruleActivity ) ) | ( (lv_roles_1_0= ruleRole ) ) | ( (lv_workProducts_2_0= ruleWorkProduct ) ) | ( (lv_workProductTypes_3_0= ruleWorkProductType ) ) | ( (lv_guidances_4_0= ruleGuidance ) ) | ( (lv_guidanceTypes_5_0= ruleGuidanceType ) ) | ( (lv_states_6_0= ruleState ) ) )*
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:80:1: ( ( (lv_activities_0_0= ruleActivity ) ) | ( (lv_roles_1_0= ruleRole ) ) | ( (lv_workProducts_2_0= ruleWorkProduct ) ) | ( (lv_workProductTypes_3_0= ruleWorkProductType ) ) | ( (lv_guidances_4_0= ruleGuidance ) ) | ( (lv_guidanceTypes_5_0= ruleGuidanceType ) ) | ( (lv_states_6_0= ruleState ) ) )*
            loop1:
            do {
                int alt1=8;
                switch ( input.LA(1) ) {
                case 21:
                    {
                    alt1=1;
                    }
                    break;
                case 11:
                    {
                    alt1=2;
                    }
                    break;
                case 14:
                    {
                    alt1=3;
                    }
                    break;
                case 13:
                    {
                    alt1=4;
                    }
                    break;
                case 17:
                    {
                    alt1=5;
                    }
                    break;
                case 16:
                    {
                    alt1=6;
                    }
                    break;
                case 18:
                    {
                    alt1=7;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:80:2: ( (lv_activities_0_0= ruleActivity ) )
            	    {
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:80:2: ( (lv_activities_0_0= ruleActivity ) )
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:81:1: (lv_activities_0_0= ruleActivity )
            	    {
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:81:1: (lv_activities_0_0= ruleActivity )
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:82:3: lv_activities_0_0= ruleActivity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getActivitiesActivityParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivity_in_ruleModel131);
            	    lv_activities_0_0=ruleActivity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"activities",
            	            		lv_activities_0_0, 
            	            		"Activity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:99:6: ( (lv_roles_1_0= ruleRole ) )
            	    {
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:99:6: ( (lv_roles_1_0= ruleRole ) )
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:100:1: (lv_roles_1_0= ruleRole )
            	    {
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:100:1: (lv_roles_1_0= ruleRole )
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:101:3: lv_roles_1_0= ruleRole
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getRolesRoleParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRole_in_ruleModel158);
            	    lv_roles_1_0=ruleRole();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"roles",
            	            		lv_roles_1_0, 
            	            		"Role");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:118:6: ( (lv_workProducts_2_0= ruleWorkProduct ) )
            	    {
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:118:6: ( (lv_workProducts_2_0= ruleWorkProduct ) )
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:119:1: (lv_workProducts_2_0= ruleWorkProduct )
            	    {
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:119:1: (lv_workProducts_2_0= ruleWorkProduct )
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:120:3: lv_workProducts_2_0= ruleWorkProduct
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getWorkProductsWorkProductParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkProduct_in_ruleModel185);
            	    lv_workProducts_2_0=ruleWorkProduct();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"workProducts",
            	            		lv_workProducts_2_0, 
            	            		"WorkProduct");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:137:6: ( (lv_workProductTypes_3_0= ruleWorkProductType ) )
            	    {
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:137:6: ( (lv_workProductTypes_3_0= ruleWorkProductType ) )
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:138:1: (lv_workProductTypes_3_0= ruleWorkProductType )
            	    {
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:138:1: (lv_workProductTypes_3_0= ruleWorkProductType )
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:139:3: lv_workProductTypes_3_0= ruleWorkProductType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getWorkProductTypesWorkProductTypeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkProductType_in_ruleModel212);
            	    lv_workProductTypes_3_0=ruleWorkProductType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"workProductTypes",
            	            		lv_workProductTypes_3_0, 
            	            		"WorkProductType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:156:6: ( (lv_guidances_4_0= ruleGuidance ) )
            	    {
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:156:6: ( (lv_guidances_4_0= ruleGuidance ) )
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:157:1: (lv_guidances_4_0= ruleGuidance )
            	    {
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:157:1: (lv_guidances_4_0= ruleGuidance )
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:158:3: lv_guidances_4_0= ruleGuidance
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getGuidancesGuidanceParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGuidance_in_ruleModel239);
            	    lv_guidances_4_0=ruleGuidance();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"guidances",
            	            		lv_guidances_4_0, 
            	            		"Guidance");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:175:6: ( (lv_guidanceTypes_5_0= ruleGuidanceType ) )
            	    {
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:175:6: ( (lv_guidanceTypes_5_0= ruleGuidanceType ) )
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:176:1: (lv_guidanceTypes_5_0= ruleGuidanceType )
            	    {
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:176:1: (lv_guidanceTypes_5_0= ruleGuidanceType )
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:177:3: lv_guidanceTypes_5_0= ruleGuidanceType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getGuidanceTypesGuidanceTypeParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGuidanceType_in_ruleModel266);
            	    lv_guidanceTypes_5_0=ruleGuidanceType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"guidanceTypes",
            	            		lv_guidanceTypes_5_0, 
            	            		"GuidanceType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:194:6: ( (lv_states_6_0= ruleState ) )
            	    {
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:194:6: ( (lv_states_6_0= ruleState ) )
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:195:1: (lv_states_6_0= ruleState )
            	    {
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:195:1: (lv_states_6_0= ruleState )
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:196:3: lv_states_6_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getStatesStateParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleModel293);
            	    lv_states_6_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_6_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRole"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:222:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:223:2: (iv_ruleRole= ruleRole EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:224:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole332);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole342); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:231:1: ruleRole returns [EObject current=null] : (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_textfield_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:234:28: ( (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:235:1: (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:235:1: (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:235:3: otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleRole379); 

                	newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:239:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:240:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:240:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:241:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole396); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:257:2: ( (lv_textfield_2_0= ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:258:1: (lv_textfield_2_0= ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:258:1: (lv_textfield_2_0= ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:259:3: lv_textfield_2_0= ruleTextfield
            {
             
            	        newCompositeNode(grammarAccess.getRoleAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTextfield_in_ruleRole422);
            lv_textfield_2_0=ruleTextfield();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRoleRule());
            	        }
                   		set(
                   			current, 
                   			"textfield",
                    		lv_textfield_2_0, 
                    		"Textfield");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleRole434); 

                	newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleWorkProductType"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:287:1: entryRuleWorkProductType returns [EObject current=null] : iv_ruleWorkProductType= ruleWorkProductType EOF ;
    public final EObject entryRuleWorkProductType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkProductType = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:288:2: (iv_ruleWorkProductType= ruleWorkProductType EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:289:2: iv_ruleWorkProductType= ruleWorkProductType EOF
            {
             newCompositeNode(grammarAccess.getWorkProductTypeRule()); 
            pushFollow(FOLLOW_ruleWorkProductType_in_entryRuleWorkProductType470);
            iv_ruleWorkProductType=ruleWorkProductType();

            state._fsp--;

             current =iv_ruleWorkProductType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkProductType480); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkProductType"


    // $ANTLR start "ruleWorkProductType"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:296:1: ruleWorkProductType returns [EObject current=null] : (otherlv_0= 'WorkProductType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' ) ;
    public final EObject ruleWorkProductType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_textfield_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:299:28: ( (otherlv_0= 'WorkProductType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:300:1: (otherlv_0= 'WorkProductType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:300:1: (otherlv_0= 'WorkProductType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:300:3: otherlv_0= 'WorkProductType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleWorkProductType517); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkProductTypeAccess().getWorkProductTypeKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:304:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:305:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:305:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:306:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkProductType534); 

            			newLeafNode(lv_name_1_0, grammarAccess.getWorkProductTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkProductTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:322:2: ( (lv_textfield_2_0= ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:323:1: (lv_textfield_2_0= ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:323:1: (lv_textfield_2_0= ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:324:3: lv_textfield_2_0= ruleTextfield
            {
             
            	        newCompositeNode(grammarAccess.getWorkProductTypeAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTextfield_in_ruleWorkProductType560);
            lv_textfield_2_0=ruleTextfield();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWorkProductTypeRule());
            	        }
                   		set(
                   			current, 
                   			"textfield",
                    		lv_textfield_2_0, 
                    		"Textfield");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleWorkProductType572); 

                	newLeafNode(otherlv_3, grammarAccess.getWorkProductTypeAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkProductType"


    // $ANTLR start "entryRuleWorkProduct"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:352:1: entryRuleWorkProduct returns [EObject current=null] : iv_ruleWorkProduct= ruleWorkProduct EOF ;
    public final EObject entryRuleWorkProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkProduct = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:353:2: (iv_ruleWorkProduct= ruleWorkProduct EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:354:2: iv_ruleWorkProduct= ruleWorkProduct EOF
            {
             newCompositeNode(grammarAccess.getWorkProductRule()); 
            pushFollow(FOLLOW_ruleWorkProduct_in_entryRuleWorkProduct608);
            iv_ruleWorkProduct=ruleWorkProduct();

            state._fsp--;

             current =iv_ruleWorkProduct; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkProduct618); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkProduct"


    // $ANTLR start "ruleWorkProduct"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:361:1: ruleWorkProduct returns [EObject current=null] : (otherlv_0= 'WorkProduct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) otherlv_5= ';' ) ;
    public final EObject ruleWorkProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_textfield_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:364:28: ( (otherlv_0= 'WorkProduct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) otherlv_5= ';' ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:365:1: (otherlv_0= 'WorkProduct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) otherlv_5= ';' )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:365:1: (otherlv_0= 'WorkProduct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) otherlv_5= ';' )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:365:3: otherlv_0= 'WorkProduct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleWorkProduct655); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkProductAccess().getWorkProductKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:369:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:370:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:370:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:371:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkProduct672); 

            			newLeafNode(lv_name_1_0, grammarAccess.getWorkProductAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkProductRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleWorkProduct689); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkProductAccess().getColonKeyword_2());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:391:1: ( (otherlv_3= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:392:1: (otherlv_3= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:392:1: (otherlv_3= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:393:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkProductRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkProduct709); 

            		newLeafNode(otherlv_3, grammarAccess.getWorkProductAccess().getTypeWorkProductTypeCrossReference_3_0()); 
            	

            }


            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:404:2: ( (lv_textfield_4_0= ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:405:1: (lv_textfield_4_0= ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:405:1: (lv_textfield_4_0= ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:406:3: lv_textfield_4_0= ruleTextfield
            {
             
            	        newCompositeNode(grammarAccess.getWorkProductAccess().getTextfieldTextfieldParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTextfield_in_ruleWorkProduct730);
            lv_textfield_4_0=ruleTextfield();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWorkProductRule());
            	        }
                   		set(
                   			current, 
                   			"textfield",
                    		lv_textfield_4_0, 
                    		"Textfield");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleWorkProduct742); 

                	newLeafNode(otherlv_5, grammarAccess.getWorkProductAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkProduct"


    // $ANTLR start "entryRuleGuidanceType"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:434:1: entryRuleGuidanceType returns [EObject current=null] : iv_ruleGuidanceType= ruleGuidanceType EOF ;
    public final EObject entryRuleGuidanceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidanceType = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:435:2: (iv_ruleGuidanceType= ruleGuidanceType EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:436:2: iv_ruleGuidanceType= ruleGuidanceType EOF
            {
             newCompositeNode(grammarAccess.getGuidanceTypeRule()); 
            pushFollow(FOLLOW_ruleGuidanceType_in_entryRuleGuidanceType778);
            iv_ruleGuidanceType=ruleGuidanceType();

            state._fsp--;

             current =iv_ruleGuidanceType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuidanceType788); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGuidanceType"


    // $ANTLR start "ruleGuidanceType"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:443:1: ruleGuidanceType returns [EObject current=null] : (otherlv_0= 'GuidanceType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' ) ;
    public final EObject ruleGuidanceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_textfield_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:446:28: ( (otherlv_0= 'GuidanceType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:447:1: (otherlv_0= 'GuidanceType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:447:1: (otherlv_0= 'GuidanceType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:447:3: otherlv_0= 'GuidanceType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleGuidanceType825); 

                	newLeafNode(otherlv_0, grammarAccess.getGuidanceTypeAccess().getGuidanceTypeKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:451:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:452:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:452:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:453:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGuidanceType842); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGuidanceTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGuidanceTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:469:2: ( (lv_textfield_2_0= ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:470:1: (lv_textfield_2_0= ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:470:1: (lv_textfield_2_0= ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:471:3: lv_textfield_2_0= ruleTextfield
            {
             
            	        newCompositeNode(grammarAccess.getGuidanceTypeAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTextfield_in_ruleGuidanceType868);
            lv_textfield_2_0=ruleTextfield();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGuidanceTypeRule());
            	        }
                   		set(
                   			current, 
                   			"textfield",
                    		lv_textfield_2_0, 
                    		"Textfield");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleGuidanceType880); 

                	newLeafNode(otherlv_3, grammarAccess.getGuidanceTypeAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGuidanceType"


    // $ANTLR start "entryRuleGuidance"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:499:1: entryRuleGuidance returns [EObject current=null] : iv_ruleGuidance= ruleGuidance EOF ;
    public final EObject entryRuleGuidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidance = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:500:2: (iv_ruleGuidance= ruleGuidance EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:501:2: iv_ruleGuidance= ruleGuidance EOF
            {
             newCompositeNode(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_ruleGuidance_in_entryRuleGuidance916);
            iv_ruleGuidance=ruleGuidance();

            state._fsp--;

             current =iv_ruleGuidance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuidance926); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:508:1: ruleGuidance returns [EObject current=null] : (otherlv_0= 'Guidance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) otherlv_5= ';' ) ;
    public final EObject ruleGuidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_textfield_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:511:28: ( (otherlv_0= 'Guidance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) otherlv_5= ';' ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:512:1: (otherlv_0= 'Guidance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) otherlv_5= ';' )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:512:1: (otherlv_0= 'Guidance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) otherlv_5= ';' )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:512:3: otherlv_0= 'Guidance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleGuidance963); 

                	newLeafNode(otherlv_0, grammarAccess.getGuidanceAccess().getGuidanceKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:516:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:517:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:517:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:518:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGuidance980); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGuidanceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGuidanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleGuidance997); 

                	newLeafNode(otherlv_2, grammarAccess.getGuidanceAccess().getColonKeyword_2());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:538:1: ( (otherlv_3= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:539:1: (otherlv_3= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:539:1: (otherlv_3= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:540:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGuidanceRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGuidance1017); 

            		newLeafNode(otherlv_3, grammarAccess.getGuidanceAccess().getTypeGuidanceTypeCrossReference_3_0()); 
            	

            }


            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:551:2: ( (lv_textfield_4_0= ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:552:1: (lv_textfield_4_0= ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:552:1: (lv_textfield_4_0= ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:553:3: lv_textfield_4_0= ruleTextfield
            {
             
            	        newCompositeNode(grammarAccess.getGuidanceAccess().getTextfieldTextfieldParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTextfield_in_ruleGuidance1038);
            lv_textfield_4_0=ruleTextfield();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGuidanceRule());
            	        }
                   		set(
                   			current, 
                   			"textfield",
                    		lv_textfield_4_0, 
                    		"Textfield");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleGuidance1050); 

                	newLeafNode(otherlv_5, grammarAccess.getGuidanceAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "entryRuleState"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:581:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:582:2: (iv_ruleState= ruleState EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:583:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState1086);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState1096); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:590:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:593:28: ( (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:594:1: (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:594:1: (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:594:3: otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleState1133); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:598:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:599:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:599:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:600:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState1150); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleState1167); 

                	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRulePort"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:628:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:629:2: (iv_rulePort= rulePort EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:630:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort1203);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort1213); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:637:1: rulePort returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )? ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:640:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )? ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:641:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )? )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:641:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )? )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:641:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )?
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:641:2: ( (otherlv_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:642:1: (otherlv_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:642:1: (otherlv_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:643:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPortRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePort1258); 

            		newLeafNode(otherlv_0, grammarAccess.getPortAccess().getTypeWorkProductCrossReference_0_0()); 
            	

            }


            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:654:2: (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:654:4: otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_rulePort1271); 

                        	newLeafNode(otherlv_1, grammarAccess.getPortAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:658:1: ( (otherlv_2= RULE_ID ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:659:1: (otherlv_2= RULE_ID )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:659:1: (otherlv_2= RULE_ID )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:660:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPortRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePort1291); 

                    		newLeafNode(otherlv_2, grammarAccess.getPortAccess().getStateStateCrossReference_1_1_0()); 
                    	

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_rulePort1303); 

                        	newLeafNode(otherlv_3, grammarAccess.getPortAccess().getRightParenthesisKeyword_1_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleActivity"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:683:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:684:2: (iv_ruleActivity= ruleActivity EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:685:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity1341);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity1351); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:692:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= 'responsible' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )* )? (otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )* )? (otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )* )? (otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? (otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}' )? otherlv_27= ';' ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        EObject lv_textfield_2_0 = null;

        EObject lv_inPorts_6_0 = null;

        EObject lv_inPorts_8_0 = null;

        EObject lv_outPorts_10_0 = null;

        EObject lv_outPorts_12_0 = null;

        EObject lv_subActivities_14_0 = null;

        EObject lv_subActivities_16_0 = null;

        EObject lv_steps_23_0 = null;

        EObject lv_decisions_24_0 = null;

        EObject lv_transitions_25_0 = null;


         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:695:28: ( (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= 'responsible' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )* )? (otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )* )? (otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )* )? (otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? (otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}' )? otherlv_27= ';' ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:696:1: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= 'responsible' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )* )? (otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )* )? (otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )* )? (otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? (otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}' )? otherlv_27= ';' )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:696:1: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= 'responsible' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )* )? (otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )* )? (otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )* )? (otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? (otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}' )? otherlv_27= ';' )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:696:3: otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= 'responsible' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )* )? (otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )* )? (otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )* )? (otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? (otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}' )? otherlv_27= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleActivity1388); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:700:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:701:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:701:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:702:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity1405); 

            			newLeafNode(lv_name_1_0, grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:718:2: ( (lv_textfield_2_0= ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:719:1: (lv_textfield_2_0= ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:719:1: (lv_textfield_2_0= ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:720:3: lv_textfield_2_0= ruleTextfield
            {
             
            	        newCompositeNode(grammarAccess.getActivityAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTextfield_in_ruleActivity1431);
            lv_textfield_2_0=ruleTextfield();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActivityRule());
            	        }
                   		set(
                   			current, 
                   			"textfield",
                    		lv_textfield_2_0, 
                    		"Textfield");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleActivity1443); 

                	newLeafNode(otherlv_3, grammarAccess.getActivityAccess().getResponsibleKeyword_3());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:740:1: ( (otherlv_4= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:741:1: (otherlv_4= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:741:1: (otherlv_4= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:742:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity1463); 

            		newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getRoleRoleCrossReference_4_0()); 
            	

            }


            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:753:2: (otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:753:4: otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )*
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleActivity1476); 

                        	newLeafNode(otherlv_5, grammarAccess.getActivityAccess().getInputsKeyword_5_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:757:1: ( (lv_inPorts_6_0= rulePort ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:758:1: (lv_inPorts_6_0= rulePort )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:758:1: (lv_inPorts_6_0= rulePort )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:759:3: lv_inPorts_6_0= rulePort
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getInPortsPortParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePort_in_ruleActivity1497);
                    lv_inPorts_6_0=rulePort();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	        }
                           		add(
                           			current, 
                           			"inPorts",
                            		lv_inPorts_6_0, 
                            		"Port");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:775:2: (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==24) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:775:4: otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) )
                    	    {
                    	    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleActivity1510); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getActivityAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:779:1: ( (lv_inPorts_8_0= rulePort ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:780:1: (lv_inPorts_8_0= rulePort )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:780:1: (lv_inPorts_8_0= rulePort )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:781:3: lv_inPorts_8_0= rulePort
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getInPortsPortParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePort_in_ruleActivity1531);
                    	    lv_inPorts_8_0=rulePort();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"inPorts",
                    	            		lv_inPorts_8_0, 
                    	            		"Port");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:797:6: (otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:797:8: otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )*
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_25_in_ruleActivity1548); 

                        	newLeafNode(otherlv_9, grammarAccess.getActivityAccess().getOutputsKeyword_6_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:801:1: ( (lv_outPorts_10_0= rulePort ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:802:1: (lv_outPorts_10_0= rulePort )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:802:1: (lv_outPorts_10_0= rulePort )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:803:3: lv_outPorts_10_0= rulePort
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getOutPortsPortParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePort_in_ruleActivity1569);
                    lv_outPorts_10_0=rulePort();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	        }
                           		add(
                           			current, 
                           			"outPorts",
                            		lv_outPorts_10_0, 
                            		"Port");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:819:2: (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==24) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:819:4: otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) )
                    	    {
                    	    otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleActivity1582); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getActivityAccess().getCommaKeyword_6_2_0());
                    	        
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:823:1: ( (lv_outPorts_12_0= rulePort ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:824:1: (lv_outPorts_12_0= rulePort )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:824:1: (lv_outPorts_12_0= rulePort )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:825:3: lv_outPorts_12_0= rulePort
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getOutPortsPortParserRuleCall_6_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePort_in_ruleActivity1603);
                    	    lv_outPorts_12_0=rulePort();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"outPorts",
                    	            		lv_outPorts_12_0, 
                    	            		"Port");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:841:6: (otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:841:8: otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )*
                    {
                    otherlv_13=(Token)match(input,26,FOLLOW_26_in_ruleActivity1620); 

                        	newLeafNode(otherlv_13, grammarAccess.getActivityAccess().getSubActivitiesKeyword_7_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:845:1: ( (lv_subActivities_14_0= ruleActivityRef ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:846:1: (lv_subActivities_14_0= ruleActivityRef )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:846:1: (lv_subActivities_14_0= ruleActivityRef )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:847:3: lv_subActivities_14_0= ruleActivityRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getSubActivitiesActivityRefParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActivityRef_in_ruleActivity1641);
                    lv_subActivities_14_0=ruleActivityRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	        }
                           		add(
                           			current, 
                           			"subActivities",
                            		lv_subActivities_14_0, 
                            		"ActivityRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:863:2: (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==24) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:863:4: otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) )
                    	    {
                    	    otherlv_15=(Token)match(input,24,FOLLOW_24_in_ruleActivity1654); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getActivityAccess().getCommaKeyword_7_2_0());
                    	        
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:867:1: ( (lv_subActivities_16_0= ruleActivityRef ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:868:1: (lv_subActivities_16_0= ruleActivityRef )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:868:1: (lv_subActivities_16_0= ruleActivityRef )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:869:3: lv_subActivities_16_0= ruleActivityRef
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getSubActivitiesActivityRefParserRuleCall_7_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleActivityRef_in_ruleActivity1675);
                    	    lv_subActivities_16_0=ruleActivityRef();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subActivities",
                    	            		lv_subActivities_16_0, 
                    	            		"ActivityRef");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:885:6: (otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:885:8: otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )*
                    {
                    otherlv_17=(Token)match(input,27,FOLLOW_27_in_ruleActivity1692); 

                        	newLeafNode(otherlv_17, grammarAccess.getActivityAccess().getGuidancesKeyword_8_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:889:1: ( (otherlv_18= RULE_ID ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:890:1: (otherlv_18= RULE_ID )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:890:1: (otherlv_18= RULE_ID )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:891:3: otherlv_18= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                            
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity1712); 

                    		newLeafNode(otherlv_18, grammarAccess.getActivityAccess().getGuidancesGuidanceCrossReference_8_1_0()); 
                    	

                    }


                    }

                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:902:2: (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==24) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:902:4: otherlv_19= ',' ( (otherlv_20= RULE_ID ) )
                    	    {
                    	    otherlv_19=(Token)match(input,24,FOLLOW_24_in_ruleActivity1725); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getActivityAccess().getCommaKeyword_8_2_0());
                    	        
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:906:1: ( (otherlv_20= RULE_ID ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:907:1: (otherlv_20= RULE_ID )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:907:1: (otherlv_20= RULE_ID )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:908:3: otherlv_20= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActivityRule());
                    	    	        }
                    	            
                    	    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity1745); 

                    	    		newLeafNode(otherlv_20, grammarAccess.getActivityAccess().getGuidancesGuidanceCrossReference_8_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:919:6: (otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:919:8: otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,28,FOLLOW_28_in_ruleActivity1762); 

                        	newLeafNode(otherlv_21, grammarAccess.getActivityAccess().getBehaviorKeyword_9_0());
                        
                    otherlv_22=(Token)match(input,29,FOLLOW_29_in_ruleActivity1774); 

                        	newLeafNode(otherlv_22, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:927:1: ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )*
                    loop11:
                    do {
                        int alt11=4;
                        switch ( input.LA(1) ) {
                        case 32:
                            {
                            alt11=1;
                            }
                            break;
                        case 31:
                            {
                            alt11=2;
                            }
                            break;
                        case 33:
                            {
                            alt11=3;
                            }
                            break;

                        }

                        switch (alt11) {
                    	case 1 :
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:927:2: ( (lv_steps_23_0= ruleStep ) )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:927:2: ( (lv_steps_23_0= ruleStep ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:928:1: (lv_steps_23_0= ruleStep )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:928:1: (lv_steps_23_0= ruleStep )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:929:3: lv_steps_23_0= ruleStep
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getStepsStepParserRuleCall_9_2_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStep_in_ruleActivity1796);
                    	    lv_steps_23_0=ruleStep();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"steps",
                    	            		lv_steps_23_0, 
                    	            		"Step");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:946:6: ( (lv_decisions_24_0= ruleDecision ) )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:946:6: ( (lv_decisions_24_0= ruleDecision ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:947:1: (lv_decisions_24_0= ruleDecision )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:947:1: (lv_decisions_24_0= ruleDecision )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:948:3: lv_decisions_24_0= ruleDecision
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getDecisionsDecisionParserRuleCall_9_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDecision_in_ruleActivity1823);
                    	    lv_decisions_24_0=ruleDecision();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"decisions",
                    	            		lv_decisions_24_0, 
                    	            		"Decision");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:965:6: ( (lv_transitions_25_0= ruleTransition ) )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:965:6: ( (lv_transitions_25_0= ruleTransition ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:966:1: (lv_transitions_25_0= ruleTransition )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:966:1: (lv_transitions_25_0= ruleTransition )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:967:3: lv_transitions_25_0= ruleTransition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getTransitionsTransitionParserRuleCall_9_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTransition_in_ruleActivity1850);
                    	    lv_transitions_25_0=ruleTransition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"transitions",
                    	            		lv_transitions_25_0, 
                    	            		"Transition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,30,FOLLOW_30_in_ruleActivity1864); 

                        	newLeafNode(otherlv_26, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_9_3());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,12,FOLLOW_12_in_ruleActivity1878); 

                	newLeafNode(otherlv_27, grammarAccess.getActivityAccess().getSemicolonKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleActivityRef"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:999:1: entryRuleActivityRef returns [EObject current=null] : iv_ruleActivityRef= ruleActivityRef EOF ;
    public final EObject entryRuleActivityRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityRef = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1000:2: (iv_ruleActivityRef= ruleActivityRef EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1001:2: iv_ruleActivityRef= ruleActivityRef EOF
            {
             newCompositeNode(grammarAccess.getActivityRefRule()); 
            pushFollow(FOLLOW_ruleActivityRef_in_entryRuleActivityRef1914);
            iv_ruleActivityRef=ruleActivityRef();

            state._fsp--;

             current =iv_ruleActivityRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityRef1924); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivityRef"


    // $ANTLR start "ruleActivityRef"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1008:1: ruleActivityRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleActivityRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1011:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1012:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1012:1: ( (otherlv_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1013:1: (otherlv_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1013:1: (otherlv_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1014:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivityRef1968); 

            		newLeafNode(otherlv_0, grammarAccess.getActivityRefAccess().getTypeActivityCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivityRef"


    // $ANTLR start "entryRuleDecision"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1035:1: entryRuleDecision returns [EObject current=null] : iv_ruleDecision= ruleDecision EOF ;
    public final EObject entryRuleDecision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecision = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1036:2: (iv_ruleDecision= ruleDecision EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1037:2: iv_ruleDecision= ruleDecision EOF
            {
             newCompositeNode(grammarAccess.getDecisionRule()); 
            pushFollow(FOLLOW_ruleDecision_in_entryRuleDecision2005);
            iv_ruleDecision=ruleDecision();

            state._fsp--;

             current =iv_ruleDecision; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecision2015); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecision"


    // $ANTLR start "ruleDecision"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1044:1: ruleDecision returns [EObject current=null] : (otherlv_0= 'Decision' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleDecision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_label_2_0=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1047:28: ( (otherlv_0= 'Decision' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1048:1: (otherlv_0= 'Decision' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1048:1: (otherlv_0= 'Decision' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1048:3: otherlv_0= 'Decision' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleDecision2052); 

                	newLeafNode(otherlv_0, grammarAccess.getDecisionAccess().getDecisionKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1052:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1053:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1053:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1054:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecision2069); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDecisionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDecisionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1070:2: ( (lv_label_2_0= RULE_STRING ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1071:1: (lv_label_2_0= RULE_STRING )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1071:1: (lv_label_2_0= RULE_STRING )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1072:3: lv_label_2_0= RULE_STRING
                    {
                    lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecision2091); 

                    			newLeafNode(lv_label_2_0, grammarAccess.getDecisionAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDecisionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecision"


    // $ANTLR start "entryRuleStep"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1096:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1097:2: (iv_ruleStep= ruleStep EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1098:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep2133);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep2143); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1105:1: ruleStep returns [EObject current=null] : (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_label_2_0=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1108:28: ( (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1109:1: (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1109:1: (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1109:3: otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleStep2180); 

                	newLeafNode(otherlv_0, grammarAccess.getStepAccess().getStepKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1113:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1114:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1114:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1115:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStep2197); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStepAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStepRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1131:2: ( (lv_label_2_0= RULE_STRING ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1132:1: (lv_label_2_0= RULE_STRING )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1132:1: (lv_label_2_0= RULE_STRING )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1133:3: lv_label_2_0= RULE_STRING
                    {
                    lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStep2219); 

                    			newLeafNode(lv_label_2_0, grammarAccess.getStepAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleTransition"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1157:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1158:2: (iv_ruleTransition= ruleTransition EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1159:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition2261);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition2271); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1166:1: ruleTransition returns [EObject current=null] : (this_InitialTransition_0= ruleInitialTransition | this_FinalTransition_1= ruleFinalTransition | this_NonInitialTransition_2= ruleNonInitialTransition | this_DecisionTransition_3= ruleDecisionTransition ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        EObject this_InitialTransition_0 = null;

        EObject this_FinalTransition_1 = null;

        EObject this_NonInitialTransition_2 = null;

        EObject this_DecisionTransition_3 = null;


         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1169:28: ( (this_InitialTransition_0= ruleInitialTransition | this_FinalTransition_1= ruleFinalTransition | this_NonInitialTransition_2= ruleNonInitialTransition | this_DecisionTransition_3= ruleDecisionTransition ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1170:1: (this_InitialTransition_0= ruleInitialTransition | this_FinalTransition_1= ruleFinalTransition | this_NonInitialTransition_2= ruleNonInitialTransition | this_DecisionTransition_3= ruleDecisionTransition )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1170:1: (this_InitialTransition_0= ruleInitialTransition | this_FinalTransition_1= ruleFinalTransition | this_NonInitialTransition_2= ruleNonInitialTransition | this_DecisionTransition_3= ruleDecisionTransition )
            int alt15=4;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==RULE_ID) ) {
                    int LA15_2 = input.LA(3);

                    if ( (LA15_2==35) ) {
                        int LA15_4 = input.LA(4);

                        if ( (LA15_4==36) ) {
                            alt15=2;
                        }
                        else if ( (LA15_4==RULE_ID) ) {
                            int LA15_6 = input.LA(5);

                            if ( (LA15_6==EOF||(LA15_6>=30 && LA15_6<=33)) ) {
                                alt15=3;
                            }
                            else if ( (LA15_6==RULE_STRING) ) {
                                alt15=4;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 15, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA15_1==34) ) {
                    alt15=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1171:5: this_InitialTransition_0= ruleInitialTransition
                    {
                     
                            newCompositeNode(grammarAccess.getTransitionAccess().getInitialTransitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInitialTransition_in_ruleTransition2318);
                    this_InitialTransition_0=ruleInitialTransition();

                    state._fsp--;

                     
                            current = this_InitialTransition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1181:5: this_FinalTransition_1= ruleFinalTransition
                    {
                     
                            newCompositeNode(grammarAccess.getTransitionAccess().getFinalTransitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFinalTransition_in_ruleTransition2345);
                    this_FinalTransition_1=ruleFinalTransition();

                    state._fsp--;

                     
                            current = this_FinalTransition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1191:5: this_NonInitialTransition_2= ruleNonInitialTransition
                    {
                     
                            newCompositeNode(grammarAccess.getTransitionAccess().getNonInitialTransitionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNonInitialTransition_in_ruleTransition2372);
                    this_NonInitialTransition_2=ruleNonInitialTransition();

                    state._fsp--;

                     
                            current = this_NonInitialTransition_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1201:5: this_DecisionTransition_3= ruleDecisionTransition
                    {
                     
                            newCompositeNode(grammarAccess.getTransitionAccess().getDecisionTransitionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDecisionTransition_in_ruleTransition2399);
                    this_DecisionTransition_3=ruleDecisionTransition();

                    state._fsp--;

                     
                            current = this_DecisionTransition_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleInitialTransition"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1217:1: entryRuleInitialTransition returns [EObject current=null] : iv_ruleInitialTransition= ruleInitialTransition EOF ;
    public final EObject entryRuleInitialTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialTransition = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1218:2: (iv_ruleInitialTransition= ruleInitialTransition EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1219:2: iv_ruleInitialTransition= ruleInitialTransition EOF
            {
             newCompositeNode(grammarAccess.getInitialTransitionRule()); 
            pushFollow(FOLLOW_ruleInitialTransition_in_entryRuleInitialTransition2434);
            iv_ruleInitialTransition=ruleInitialTransition();

            state._fsp--;

             current =iv_ruleInitialTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitialTransition2444); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialTransition"


    // $ANTLR start "ruleInitialTransition"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1226:1: ruleInitialTransition returns [EObject current=null] : (otherlv_0= 'Transition' otherlv_1= 'initial' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleInitialTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1229:28: ( (otherlv_0= 'Transition' otherlv_1= 'initial' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1230:1: (otherlv_0= 'Transition' otherlv_1= 'initial' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1230:1: (otherlv_0= 'Transition' otherlv_1= 'initial' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1230:3: otherlv_0= 'Transition' otherlv_1= 'initial' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleInitialTransition2481); 

                	newLeafNode(otherlv_0, grammarAccess.getInitialTransitionAccess().getTransitionKeyword_0());
                
            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleInitialTransition2493); 

                	newLeafNode(otherlv_1, grammarAccess.getInitialTransitionAccess().getInitialKeyword_1());
                
            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleInitialTransition2505); 

                	newLeafNode(otherlv_2, grammarAccess.getInitialTransitionAccess().getToKeyword_2());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1242:1: ( (otherlv_3= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1243:1: (otherlv_3= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1243:1: (otherlv_3= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1244:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInitialTransitionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInitialTransition2525); 

            		newLeafNode(otherlv_3, grammarAccess.getInitialTransitionAccess().getToNodeCrossReference_3_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialTransition"


    // $ANTLR start "entryRuleFinalTransition"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1263:1: entryRuleFinalTransition returns [EObject current=null] : iv_ruleFinalTransition= ruleFinalTransition EOF ;
    public final EObject entryRuleFinalTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinalTransition = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1264:2: (iv_ruleFinalTransition= ruleFinalTransition EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1265:2: iv_ruleFinalTransition= ruleFinalTransition EOF
            {
             newCompositeNode(grammarAccess.getFinalTransitionRule()); 
            pushFollow(FOLLOW_ruleFinalTransition_in_entryRuleFinalTransition2561);
            iv_ruleFinalTransition=ruleFinalTransition();

            state._fsp--;

             current =iv_ruleFinalTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFinalTransition2571); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFinalTransition"


    // $ANTLR start "ruleFinalTransition"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1272:1: ruleFinalTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' otherlv_3= 'final' ) ;
    public final EObject ruleFinalTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1275:28: ( (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' otherlv_3= 'final' ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1276:1: (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' otherlv_3= 'final' )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1276:1: (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' otherlv_3= 'final' )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1276:3: otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' otherlv_3= 'final'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleFinalTransition2608); 

                	newLeafNode(otherlv_0, grammarAccess.getFinalTransitionAccess().getTransitionKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1280:1: ( (otherlv_1= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1281:1: (otherlv_1= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1281:1: (otherlv_1= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1282:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFinalTransitionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFinalTransition2628); 

            		newLeafNode(otherlv_1, grammarAccess.getFinalTransitionAccess().getFromNodeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleFinalTransition2640); 

                	newLeafNode(otherlv_2, grammarAccess.getFinalTransitionAccess().getToKeyword_2());
                
            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleFinalTransition2652); 

                	newLeafNode(otherlv_3, grammarAccess.getFinalTransitionAccess().getFinalKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFinalTransition"


    // $ANTLR start "entryRuleDecisionTransition"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1309:1: entryRuleDecisionTransition returns [EObject current=null] : iv_ruleDecisionTransition= ruleDecisionTransition EOF ;
    public final EObject entryRuleDecisionTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecisionTransition = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1310:2: (iv_ruleDecisionTransition= ruleDecisionTransition EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1311:2: iv_ruleDecisionTransition= ruleDecisionTransition EOF
            {
             newCompositeNode(grammarAccess.getDecisionTransitionRule()); 
            pushFollow(FOLLOW_ruleDecisionTransition_in_entryRuleDecisionTransition2688);
            iv_ruleDecisionTransition=ruleDecisionTransition();

            state._fsp--;

             current =iv_ruleDecisionTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecisionTransition2698); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecisionTransition"


    // $ANTLR start "ruleDecisionTransition"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1318:1: ruleDecisionTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ( (lv_guard_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleDecisionTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_guard_4_0=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1321:28: ( (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ( (lv_guard_4_0= RULE_STRING ) ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1322:1: (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ( (lv_guard_4_0= RULE_STRING ) ) )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1322:1: (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ( (lv_guard_4_0= RULE_STRING ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1322:3: otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ( (lv_guard_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleDecisionTransition2735); 

                	newLeafNode(otherlv_0, grammarAccess.getDecisionTransitionAccess().getTransitionKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1326:1: ( (otherlv_1= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1327:1: (otherlv_1= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1327:1: (otherlv_1= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1328:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDecisionTransitionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecisionTransition2755); 

            		newLeafNode(otherlv_1, grammarAccess.getDecisionTransitionAccess().getFromDecisionCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleDecisionTransition2767); 

                	newLeafNode(otherlv_2, grammarAccess.getDecisionTransitionAccess().getToKeyword_2());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1343:1: ( (otherlv_3= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1344:1: (otherlv_3= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1344:1: (otherlv_3= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1345:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDecisionTransitionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecisionTransition2787); 

            		newLeafNode(otherlv_3, grammarAccess.getDecisionTransitionAccess().getToNodeCrossReference_3_0()); 
            	

            }


            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1356:2: ( (lv_guard_4_0= RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1357:1: (lv_guard_4_0= RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1357:1: (lv_guard_4_0= RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1358:3: lv_guard_4_0= RULE_STRING
            {
            lv_guard_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecisionTransition2804); 

            			newLeafNode(lv_guard_4_0, grammarAccess.getDecisionTransitionAccess().getGuardSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDecisionTransitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"guard",
                    		lv_guard_4_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecisionTransition"


    // $ANTLR start "entryRuleNonInitialTransition"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1382:1: entryRuleNonInitialTransition returns [EObject current=null] : iv_ruleNonInitialTransition= ruleNonInitialTransition EOF ;
    public final EObject entryRuleNonInitialTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonInitialTransition = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1383:2: (iv_ruleNonInitialTransition= ruleNonInitialTransition EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1384:2: iv_ruleNonInitialTransition= ruleNonInitialTransition EOF
            {
             newCompositeNode(grammarAccess.getNonInitialTransitionRule()); 
            pushFollow(FOLLOW_ruleNonInitialTransition_in_entryRuleNonInitialTransition2845);
            iv_ruleNonInitialTransition=ruleNonInitialTransition();

            state._fsp--;

             current =iv_ruleNonInitialTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonInitialTransition2855); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonInitialTransition"


    // $ANTLR start "ruleNonInitialTransition"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1391:1: ruleNonInitialTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleNonInitialTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1394:28: ( (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1395:1: (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1395:1: (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1395:3: otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleNonInitialTransition2892); 

                	newLeafNode(otherlv_0, grammarAccess.getNonInitialTransitionAccess().getTransitionKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1399:1: ( (otherlv_1= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1400:1: (otherlv_1= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1400:1: (otherlv_1= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1401:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNonInitialTransitionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNonInitialTransition2912); 

            		newLeafNode(otherlv_1, grammarAccess.getNonInitialTransitionAccess().getFromNodeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleNonInitialTransition2924); 

                	newLeafNode(otherlv_2, grammarAccess.getNonInitialTransitionAccess().getToKeyword_2());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1416:1: ( (otherlv_3= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1417:1: (otherlv_3= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1417:1: (otherlv_3= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1418:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNonInitialTransitionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNonInitialTransition2944); 

            		newLeafNode(otherlv_3, grammarAccess.getNonInitialTransitionAccess().getToNodeCrossReference_3_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonInitialTransition"


    // $ANTLR start "entryRuleTextfield"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1437:1: entryRuleTextfield returns [EObject current=null] : iv_ruleTextfield= ruleTextfield EOF ;
    public final EObject entryRuleTextfield() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextfield = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1438:2: (iv_ruleTextfield= ruleTextfield EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1439:2: iv_ruleTextfield= ruleTextfield EOF
            {
             newCompositeNode(grammarAccess.getTextfieldRule()); 
            pushFollow(FOLLOW_ruleTextfield_in_entryRuleTextfield2980);
            iv_ruleTextfield=ruleTextfield();

            state._fsp--;

             current =iv_ruleTextfield; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextfield2990); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextfield"


    // $ANTLR start "ruleTextfield"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1446:1: ruleTextfield returns [EObject current=null] : ( (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) )? otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleTextfield() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_1_0=null;
        Token otherlv_2=null;
        Token lv_summary_3_0=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1449:28: ( ( (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) )? otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1450:1: ( (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) )? otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1450:1: ( (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) )? otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1450:2: (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) )? otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1450:2: (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1450:4: otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleTextfield3028); 

                        	newLeafNode(otherlv_0, grammarAccess.getTextfieldAccess().getLabelKeyword_0_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1454:1: ( (lv_label_1_0= RULE_STRING ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1455:1: (lv_label_1_0= RULE_STRING )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1455:1: (lv_label_1_0= RULE_STRING )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1456:3: lv_label_1_0= RULE_STRING
                    {
                    lv_label_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextfield3045); 

                    			newLeafNode(lv_label_1_0, grammarAccess.getTextfieldAccess().getLabelSTRINGTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTextfieldRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleTextfield3064); 

                	newLeafNode(otherlv_2, grammarAccess.getTextfieldAccess().getSummaryKeyword_1());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1476:1: ( (lv_summary_3_0= RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1477:1: (lv_summary_3_0= RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1477:1: (lv_summary_3_0= RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1478:3: lv_summary_3_0= RULE_STRING
            {
            lv_summary_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextfield3081); 

            			newLeafNode(lv_summary_3_0, grammarAccess.getTextfieldAccess().getSummarySTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextfieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"summary",
                    		lv_summary_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1494:2: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1494:4: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleTextfield3099); 

                        	newLeafNode(otherlv_4, grammarAccess.getTextfieldAccess().getDescriptionKeyword_3_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1498:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1499:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1499:1: (lv_description_5_0= RULE_STRING )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1500:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextfield3116); 

                    			newLeafNode(lv_description_5_0, grammarAccess.getTextfieldAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTextfieldRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextfield"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleModel131 = new BitSet(new long[]{0x0000000000276802L});
    public static final BitSet FOLLOW_ruleRole_in_ruleModel158 = new BitSet(new long[]{0x0000000000276802L});
    public static final BitSet FOLLOW_ruleWorkProduct_in_ruleModel185 = new BitSet(new long[]{0x0000000000276802L});
    public static final BitSet FOLLOW_ruleWorkProductType_in_ruleModel212 = new BitSet(new long[]{0x0000000000276802L});
    public static final BitSet FOLLOW_ruleGuidance_in_ruleModel239 = new BitSet(new long[]{0x0000000000276802L});
    public static final BitSet FOLLOW_ruleGuidanceType_in_ruleModel266 = new BitSet(new long[]{0x0000000000276802L});
    public static final BitSet FOLLOW_ruleState_in_ruleModel293 = new BitSet(new long[]{0x0000000000276802L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleRole379 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole396 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_ruleTextfield_in_ruleRole422 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRole434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkProductType_in_entryRuleWorkProductType470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkProductType480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleWorkProductType517 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkProductType534 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_ruleTextfield_in_ruleWorkProductType560 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleWorkProductType572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkProduct_in_entryRuleWorkProduct608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkProduct618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleWorkProduct655 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkProduct672 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleWorkProduct689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkProduct709 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_ruleTextfield_in_ruleWorkProduct730 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleWorkProduct742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidanceType_in_entryRuleGuidanceType778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuidanceType788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleGuidanceType825 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGuidanceType842 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_ruleTextfield_in_ruleGuidanceType868 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGuidanceType880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidance_in_entryRuleGuidance916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuidance926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleGuidance963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGuidance980 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleGuidance997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGuidance1017 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_ruleTextfield_in_ruleGuidance1038 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGuidance1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState1086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleState1133 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState1150 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePort1258 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_rulePort1271 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePort1291 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePort1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity1341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleActivity1388 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity1405 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_ruleTextfield_in_ruleActivity1431 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActivity1443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity1463 = new BitSet(new long[]{0x000000001E801000L});
    public static final BitSet FOLLOW_23_in_ruleActivity1476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePort_in_ruleActivity1497 = new BitSet(new long[]{0x000000001F001000L});
    public static final BitSet FOLLOW_24_in_ruleActivity1510 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePort_in_ruleActivity1531 = new BitSet(new long[]{0x000000001F001000L});
    public static final BitSet FOLLOW_25_in_ruleActivity1548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePort_in_ruleActivity1569 = new BitSet(new long[]{0x000000001D001000L});
    public static final BitSet FOLLOW_24_in_ruleActivity1582 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePort_in_ruleActivity1603 = new BitSet(new long[]{0x000000001D001000L});
    public static final BitSet FOLLOW_26_in_ruleActivity1620 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleActivityRef_in_ruleActivity1641 = new BitSet(new long[]{0x0000000019001000L});
    public static final BitSet FOLLOW_24_in_ruleActivity1654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleActivityRef_in_ruleActivity1675 = new BitSet(new long[]{0x0000000019001000L});
    public static final BitSet FOLLOW_27_in_ruleActivity1692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity1712 = new BitSet(new long[]{0x0000000011001000L});
    public static final BitSet FOLLOW_24_in_ruleActivity1725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity1745 = new BitSet(new long[]{0x0000000011001000L});
    public static final BitSet FOLLOW_28_in_ruleActivity1762 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleActivity1774 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_ruleStep_in_ruleActivity1796 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_ruleDecision_in_ruleActivity1823 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleActivity1850 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_30_in_ruleActivity1864 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActivity1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityRef_in_entryRuleActivityRef1914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityRef1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivityRef1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecision_in_entryRuleDecision2005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecision2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDecision2052 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecision2069 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecision2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep2133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleStep2180 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStep2197 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStep2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition2261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialTransition_in_ruleTransition2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFinalTransition_in_ruleTransition2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonInitialTransition_in_ruleTransition2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecisionTransition_in_ruleTransition2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialTransition_in_entryRuleInitialTransition2434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitialTransition2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleInitialTransition2481 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleInitialTransition2493 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleInitialTransition2505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInitialTransition2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFinalTransition_in_entryRuleFinalTransition2561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFinalTransition2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleFinalTransition2608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFinalTransition2628 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleFinalTransition2640 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleFinalTransition2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecisionTransition_in_entryRuleDecisionTransition2688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecisionTransition2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDecisionTransition2735 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecisionTransition2755 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleDecisionTransition2767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecisionTransition2787 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecisionTransition2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonInitialTransition_in_entryRuleNonInitialTransition2845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonInitialTransition2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleNonInitialTransition2892 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNonInitialTransition2912 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleNonInitialTransition2924 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNonInitialTransition2944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_entryRuleTextfield2980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextfield2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTextfield3028 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextfield3045 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleTextfield3064 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextfield3081 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleTextfield3099 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextfield3116 = new BitSet(new long[]{0x0000000000000002L});

}