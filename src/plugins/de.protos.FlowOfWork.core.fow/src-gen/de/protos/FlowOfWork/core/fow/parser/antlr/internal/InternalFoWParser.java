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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Role'", "';'", "'WorkProductType'", "'WorkProduct'", "':'", "'GuidanceType'", "'Guidance'", "'Activity'", "'responsible'", "'inputs'", "','", "'outputs'", "'subActivities'", "'guidances'", "'Behavior'", "'{'", "'}'", "'Decision'", "'Step'", "'Transition'", "'initial'", "'->'", "'final'", "'label'", "'summary'", "'description'"
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
    public static final int T__12=12;
    public static final int T__11=11;
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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_activities_0_0= ruleActivity ) ) | ( (lv_roles_1_0= ruleRole ) ) | ( (lv_workProducts_2_0= ruleWorkProduct ) ) | ( (lv_workProductTypes_3_0= ruleWorkProductType ) ) | ( (lv_guidances_4_0= ruleGuidance ) ) | ( (lv_guidanceTypes_5_0= ruleGuidanceType ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_activities_0_0 = null;

        EObject lv_roles_1_0 = null;

        EObject lv_workProducts_2_0 = null;

        EObject lv_workProductTypes_3_0 = null;

        EObject lv_guidances_4_0 = null;

        EObject lv_guidanceTypes_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:79:28: ( ( ( (lv_activities_0_0= ruleActivity ) ) | ( (lv_roles_1_0= ruleRole ) ) | ( (lv_workProducts_2_0= ruleWorkProduct ) ) | ( (lv_workProductTypes_3_0= ruleWorkProductType ) ) | ( (lv_guidances_4_0= ruleGuidance ) ) | ( (lv_guidanceTypes_5_0= ruleGuidanceType ) ) )* )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:80:1: ( ( (lv_activities_0_0= ruleActivity ) ) | ( (lv_roles_1_0= ruleRole ) ) | ( (lv_workProducts_2_0= ruleWorkProduct ) ) | ( (lv_workProductTypes_3_0= ruleWorkProductType ) ) | ( (lv_guidances_4_0= ruleGuidance ) ) | ( (lv_guidanceTypes_5_0= ruleGuidanceType ) ) )*
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:80:1: ( ( (lv_activities_0_0= ruleActivity ) ) | ( (lv_roles_1_0= ruleRole ) ) | ( (lv_workProducts_2_0= ruleWorkProduct ) ) | ( (lv_workProductTypes_3_0= ruleWorkProductType ) ) | ( (lv_guidances_4_0= ruleGuidance ) ) | ( (lv_guidanceTypes_5_0= ruleGuidanceType ) ) )*
            loop1:
            do {
                int alt1=7;
                switch ( input.LA(1) ) {
                case 18:
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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:203:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:204:2: (iv_ruleRole= ruleRole EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:205:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole305);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole315); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:212:1: ruleRole returns [EObject current=null] : (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_textfield_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:215:28: ( (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:216:1: (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:216:1: (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:216:3: otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleRole352); 

                	newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:220:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:221:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:221:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:222:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole369); 

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

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:238:2: ( (lv_textfield_2_0= ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:239:1: (lv_textfield_2_0= ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:239:1: (lv_textfield_2_0= ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:240:3: lv_textfield_2_0= ruleTextfield
            {
             
            	        newCompositeNode(grammarAccess.getRoleAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTextfield_in_ruleRole395);
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleRole407); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:268:1: entryRuleWorkProductType returns [EObject current=null] : iv_ruleWorkProductType= ruleWorkProductType EOF ;
    public final EObject entryRuleWorkProductType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkProductType = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:269:2: (iv_ruleWorkProductType= ruleWorkProductType EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:270:2: iv_ruleWorkProductType= ruleWorkProductType EOF
            {
             newCompositeNode(grammarAccess.getWorkProductTypeRule()); 
            pushFollow(FOLLOW_ruleWorkProductType_in_entryRuleWorkProductType443);
            iv_ruleWorkProductType=ruleWorkProductType();

            state._fsp--;

             current =iv_ruleWorkProductType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkProductType453); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:277:1: ruleWorkProductType returns [EObject current=null] : (otherlv_0= 'WorkProductType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' ) ;
    public final EObject ruleWorkProductType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_textfield_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:280:28: ( (otherlv_0= 'WorkProductType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:281:1: (otherlv_0= 'WorkProductType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:281:1: (otherlv_0= 'WorkProductType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:281:3: otherlv_0= 'WorkProductType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleWorkProductType490); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkProductTypeAccess().getWorkProductTypeKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:285:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:286:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:286:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:287:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkProductType507); 

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

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:303:2: ( (lv_textfield_2_0= ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:304:1: (lv_textfield_2_0= ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:304:1: (lv_textfield_2_0= ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:305:3: lv_textfield_2_0= ruleTextfield
            {
             
            	        newCompositeNode(grammarAccess.getWorkProductTypeAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTextfield_in_ruleWorkProductType533);
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleWorkProductType545); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:333:1: entryRuleWorkProduct returns [EObject current=null] : iv_ruleWorkProduct= ruleWorkProduct EOF ;
    public final EObject entryRuleWorkProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkProduct = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:334:2: (iv_ruleWorkProduct= ruleWorkProduct EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:335:2: iv_ruleWorkProduct= ruleWorkProduct EOF
            {
             newCompositeNode(grammarAccess.getWorkProductRule()); 
            pushFollow(FOLLOW_ruleWorkProduct_in_entryRuleWorkProduct581);
            iv_ruleWorkProduct=ruleWorkProduct();

            state._fsp--;

             current =iv_ruleWorkProduct; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkProduct591); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:342:1: ruleWorkProduct returns [EObject current=null] : (otherlv_0= 'WorkProduct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) otherlv_5= ';' ) ;
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
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:345:28: ( (otherlv_0= 'WorkProduct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) otherlv_5= ';' ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:346:1: (otherlv_0= 'WorkProduct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) otherlv_5= ';' )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:346:1: (otherlv_0= 'WorkProduct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) otherlv_5= ';' )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:346:3: otherlv_0= 'WorkProduct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleWorkProduct628); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkProductAccess().getWorkProductKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:350:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:351:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:351:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:352:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkProduct645); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleWorkProduct662); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkProductAccess().getColonKeyword_2());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:372:1: ( (otherlv_3= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:373:1: (otherlv_3= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:373:1: (otherlv_3= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:374:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkProductRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkProduct682); 

            		newLeafNode(otherlv_3, grammarAccess.getWorkProductAccess().getTypeWorkProductTypeCrossReference_3_0()); 
            	

            }


            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:385:2: ( (lv_textfield_4_0= ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:386:1: (lv_textfield_4_0= ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:386:1: (lv_textfield_4_0= ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:387:3: lv_textfield_4_0= ruleTextfield
            {
             
            	        newCompositeNode(grammarAccess.getWorkProductAccess().getTextfieldTextfieldParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTextfield_in_ruleWorkProduct703);
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

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleWorkProduct715); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:415:1: entryRuleGuidanceType returns [EObject current=null] : iv_ruleGuidanceType= ruleGuidanceType EOF ;
    public final EObject entryRuleGuidanceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidanceType = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:416:2: (iv_ruleGuidanceType= ruleGuidanceType EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:417:2: iv_ruleGuidanceType= ruleGuidanceType EOF
            {
             newCompositeNode(grammarAccess.getGuidanceTypeRule()); 
            pushFollow(FOLLOW_ruleGuidanceType_in_entryRuleGuidanceType751);
            iv_ruleGuidanceType=ruleGuidanceType();

            state._fsp--;

             current =iv_ruleGuidanceType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuidanceType761); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:424:1: ruleGuidanceType returns [EObject current=null] : (otherlv_0= 'GuidanceType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' ) ;
    public final EObject ruleGuidanceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_textfield_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:427:28: ( (otherlv_0= 'GuidanceType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:428:1: (otherlv_0= 'GuidanceType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:428:1: (otherlv_0= 'GuidanceType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:428:3: otherlv_0= 'GuidanceType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleGuidanceType798); 

                	newLeafNode(otherlv_0, grammarAccess.getGuidanceTypeAccess().getGuidanceTypeKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:432:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:433:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:433:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:434:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGuidanceType815); 

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

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:450:2: ( (lv_textfield_2_0= ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:451:1: (lv_textfield_2_0= ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:451:1: (lv_textfield_2_0= ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:452:3: lv_textfield_2_0= ruleTextfield
            {
             
            	        newCompositeNode(grammarAccess.getGuidanceTypeAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTextfield_in_ruleGuidanceType841);
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleGuidanceType853); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:480:1: entryRuleGuidance returns [EObject current=null] : iv_ruleGuidance= ruleGuidance EOF ;
    public final EObject entryRuleGuidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidance = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:481:2: (iv_ruleGuidance= ruleGuidance EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:482:2: iv_ruleGuidance= ruleGuidance EOF
            {
             newCompositeNode(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_ruleGuidance_in_entryRuleGuidance889);
            iv_ruleGuidance=ruleGuidance();

            state._fsp--;

             current =iv_ruleGuidance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuidance899); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:489:1: ruleGuidance returns [EObject current=null] : (otherlv_0= 'Guidance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) otherlv_5= ';' ) ;
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
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:492:28: ( (otherlv_0= 'Guidance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) otherlv_5= ';' ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:493:1: (otherlv_0= 'Guidance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) otherlv_5= ';' )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:493:1: (otherlv_0= 'Guidance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) otherlv_5= ';' )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:493:3: otherlv_0= 'Guidance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleGuidance936); 

                	newLeafNode(otherlv_0, grammarAccess.getGuidanceAccess().getGuidanceKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:497:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:498:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:498:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:499:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGuidance953); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleGuidance970); 

                	newLeafNode(otherlv_2, grammarAccess.getGuidanceAccess().getColonKeyword_2());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:519:1: ( (otherlv_3= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:520:1: (otherlv_3= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:520:1: (otherlv_3= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:521:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGuidanceRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGuidance990); 

            		newLeafNode(otherlv_3, grammarAccess.getGuidanceAccess().getTypeGuidanceTypeCrossReference_3_0()); 
            	

            }


            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:532:2: ( (lv_textfield_4_0= ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:533:1: (lv_textfield_4_0= ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:533:1: (lv_textfield_4_0= ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:534:3: lv_textfield_4_0= ruleTextfield
            {
             
            	        newCompositeNode(grammarAccess.getGuidanceAccess().getTextfieldTextfieldParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTextfield_in_ruleGuidance1011);
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

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleGuidance1023); 

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


    // $ANTLR start "entryRulePort"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:562:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:563:2: (iv_rulePort= rulePort EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:564:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort1059);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort1069); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:571:1: rulePort returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:574:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:575:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:575:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:575:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:575:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:576:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:576:1: (lv_name_0_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:577:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePort1111); 

            			newLeafNode(lv_name_0_0, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPortRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_rulePort1128); 

                	newLeafNode(otherlv_1, grammarAccess.getPortAccess().getColonKeyword_1());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:597:1: ( (otherlv_2= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:598:1: (otherlv_2= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:598:1: (otherlv_2= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:599:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPortRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePort1148); 

            		newLeafNode(otherlv_2, grammarAccess.getPortAccess().getTypeWorkProductCrossReference_2_0()); 
            	

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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleActivity"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:618:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:619:2: (iv_ruleActivity= ruleActivity EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:620:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity1184);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity1194); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:627:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= 'responsible' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )* )? (otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )* )? (otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )* )? (otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? (otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}' )? otherlv_27= ';' ) ;
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
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:630:28: ( (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= 'responsible' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )* )? (otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )* )? (otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )* )? (otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? (otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}' )? otherlv_27= ';' ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:631:1: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= 'responsible' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )* )? (otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )* )? (otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )* )? (otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? (otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}' )? otherlv_27= ';' )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:631:1: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= 'responsible' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )* )? (otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )* )? (otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )* )? (otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? (otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}' )? otherlv_27= ';' )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:631:3: otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= 'responsible' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )* )? (otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )* )? (otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )* )? (otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? (otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}' )? otherlv_27= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleActivity1231); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:635:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:636:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:636:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:637:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity1248); 

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

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:653:2: ( (lv_textfield_2_0= ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:654:1: (lv_textfield_2_0= ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:654:1: (lv_textfield_2_0= ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:655:3: lv_textfield_2_0= ruleTextfield
            {
             
            	        newCompositeNode(grammarAccess.getActivityAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTextfield_in_ruleActivity1274);
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

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleActivity1286); 

                	newLeafNode(otherlv_3, grammarAccess.getActivityAccess().getResponsibleKeyword_3());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:675:1: ( (otherlv_4= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:676:1: (otherlv_4= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:676:1: (otherlv_4= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:677:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity1306); 

            		newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getRoleRoleCrossReference_4_0()); 
            	

            }


            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:688:2: (otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:688:4: otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )*
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleActivity1319); 

                        	newLeafNode(otherlv_5, grammarAccess.getActivityAccess().getInputsKeyword_5_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:692:1: ( (lv_inPorts_6_0= rulePort ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:693:1: (lv_inPorts_6_0= rulePort )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:693:1: (lv_inPorts_6_0= rulePort )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:694:3: lv_inPorts_6_0= rulePort
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getInPortsPortParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePort_in_ruleActivity1340);
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

                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:710:2: (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==21) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:710:4: otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) )
                    	    {
                    	    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleActivity1353); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getActivityAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:714:1: ( (lv_inPorts_8_0= rulePort ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:715:1: (lv_inPorts_8_0= rulePort )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:715:1: (lv_inPorts_8_0= rulePort )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:716:3: lv_inPorts_8_0= rulePort
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getInPortsPortParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePort_in_ruleActivity1374);
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
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:732:6: (otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:732:8: otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )*
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleActivity1391); 

                        	newLeafNode(otherlv_9, grammarAccess.getActivityAccess().getOutputsKeyword_6_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:736:1: ( (lv_outPorts_10_0= rulePort ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:737:1: (lv_outPorts_10_0= rulePort )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:737:1: (lv_outPorts_10_0= rulePort )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:738:3: lv_outPorts_10_0= rulePort
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getOutPortsPortParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePort_in_ruleActivity1412);
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

                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:754:2: (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==21) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:754:4: otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) )
                    	    {
                    	    otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleActivity1425); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getActivityAccess().getCommaKeyword_6_2_0());
                    	        
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:758:1: ( (lv_outPorts_12_0= rulePort ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:759:1: (lv_outPorts_12_0= rulePort )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:759:1: (lv_outPorts_12_0= rulePort )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:760:3: lv_outPorts_12_0= rulePort
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getOutPortsPortParserRuleCall_6_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePort_in_ruleActivity1446);
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
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:776:6: (otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:776:8: otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )*
                    {
                    otherlv_13=(Token)match(input,23,FOLLOW_23_in_ruleActivity1463); 

                        	newLeafNode(otherlv_13, grammarAccess.getActivityAccess().getSubActivitiesKeyword_7_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:780:1: ( (lv_subActivities_14_0= ruleActivityRef ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:781:1: (lv_subActivities_14_0= ruleActivityRef )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:781:1: (lv_subActivities_14_0= ruleActivityRef )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:782:3: lv_subActivities_14_0= ruleActivityRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getSubActivitiesActivityRefParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActivityRef_in_ruleActivity1484);
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

                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:798:2: (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==21) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:798:4: otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) )
                    	    {
                    	    otherlv_15=(Token)match(input,21,FOLLOW_21_in_ruleActivity1497); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getActivityAccess().getCommaKeyword_7_2_0());
                    	        
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:802:1: ( (lv_subActivities_16_0= ruleActivityRef ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:803:1: (lv_subActivities_16_0= ruleActivityRef )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:803:1: (lv_subActivities_16_0= ruleActivityRef )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:804:3: lv_subActivities_16_0= ruleActivityRef
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getSubActivitiesActivityRefParserRuleCall_7_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleActivityRef_in_ruleActivity1518);
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
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:820:6: (otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:820:8: otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )*
                    {
                    otherlv_17=(Token)match(input,24,FOLLOW_24_in_ruleActivity1535); 

                        	newLeafNode(otherlv_17, grammarAccess.getActivityAccess().getGuidancesKeyword_8_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:824:1: ( (otherlv_18= RULE_ID ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:825:1: (otherlv_18= RULE_ID )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:825:1: (otherlv_18= RULE_ID )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:826:3: otherlv_18= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                            
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity1555); 

                    		newLeafNode(otherlv_18, grammarAccess.getActivityAccess().getGuidancesGuidanceCrossReference_8_1_0()); 
                    	

                    }


                    }

                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:837:2: (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==21) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:837:4: otherlv_19= ',' ( (otherlv_20= RULE_ID ) )
                    	    {
                    	    otherlv_19=(Token)match(input,21,FOLLOW_21_in_ruleActivity1568); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getActivityAccess().getCommaKeyword_8_2_0());
                    	        
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:841:1: ( (otherlv_20= RULE_ID ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:842:1: (otherlv_20= RULE_ID )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:842:1: (otherlv_20= RULE_ID )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:843:3: otherlv_20= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActivityRule());
                    	    	        }
                    	            
                    	    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity1588); 

                    	    		newLeafNode(otherlv_20, grammarAccess.getActivityAccess().getGuidancesGuidanceCrossReference_8_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:854:6: (otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:854:8: otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,25,FOLLOW_25_in_ruleActivity1605); 

                        	newLeafNode(otherlv_21, grammarAccess.getActivityAccess().getBehaviorKeyword_9_0());
                        
                    otherlv_22=(Token)match(input,26,FOLLOW_26_in_ruleActivity1617); 

                        	newLeafNode(otherlv_22, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:862:1: ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )*
                    loop10:
                    do {
                        int alt10=4;
                        switch ( input.LA(1) ) {
                        case 29:
                            {
                            alt10=1;
                            }
                            break;
                        case 28:
                            {
                            alt10=2;
                            }
                            break;
                        case 30:
                            {
                            alt10=3;
                            }
                            break;

                        }

                        switch (alt10) {
                    	case 1 :
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:862:2: ( (lv_steps_23_0= ruleStep ) )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:862:2: ( (lv_steps_23_0= ruleStep ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:863:1: (lv_steps_23_0= ruleStep )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:863:1: (lv_steps_23_0= ruleStep )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:864:3: lv_steps_23_0= ruleStep
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getStepsStepParserRuleCall_9_2_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStep_in_ruleActivity1639);
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
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:881:6: ( (lv_decisions_24_0= ruleDecision ) )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:881:6: ( (lv_decisions_24_0= ruleDecision ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:882:1: (lv_decisions_24_0= ruleDecision )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:882:1: (lv_decisions_24_0= ruleDecision )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:883:3: lv_decisions_24_0= ruleDecision
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getDecisionsDecisionParserRuleCall_9_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDecision_in_ruleActivity1666);
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
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:900:6: ( (lv_transitions_25_0= ruleTransition ) )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:900:6: ( (lv_transitions_25_0= ruleTransition ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:901:1: (lv_transitions_25_0= ruleTransition )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:901:1: (lv_transitions_25_0= ruleTransition )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:902:3: lv_transitions_25_0= ruleTransition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getTransitionsTransitionParserRuleCall_9_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTransition_in_ruleActivity1693);
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
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,27,FOLLOW_27_in_ruleActivity1707); 

                        	newLeafNode(otherlv_26, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_9_3());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,12,FOLLOW_12_in_ruleActivity1721); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:934:1: entryRuleActivityRef returns [EObject current=null] : iv_ruleActivityRef= ruleActivityRef EOF ;
    public final EObject entryRuleActivityRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityRef = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:935:2: (iv_ruleActivityRef= ruleActivityRef EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:936:2: iv_ruleActivityRef= ruleActivityRef EOF
            {
             newCompositeNode(grammarAccess.getActivityRefRule()); 
            pushFollow(FOLLOW_ruleActivityRef_in_entryRuleActivityRef1757);
            iv_ruleActivityRef=ruleActivityRef();

            state._fsp--;

             current =iv_ruleActivityRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityRef1767); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:943:1: ruleActivityRef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleActivityRef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:946:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:947:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:947:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:947:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:947:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:948:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:948:1: (lv_name_0_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:949:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivityRef1809); 

            			newLeafNode(lv_name_0_0, grammarAccess.getActivityRefAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleActivityRef1826); 

                	newLeafNode(otherlv_1, grammarAccess.getActivityRefAccess().getColonKeyword_1());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:969:1: ( (otherlv_2= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:970:1: (otherlv_2= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:970:1: (otherlv_2= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:971:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRefRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivityRef1846); 

            		newLeafNode(otherlv_2, grammarAccess.getActivityRefAccess().getTypeActivityCrossReference_2_0()); 
            	

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
    // $ANTLR end "ruleActivityRef"


    // $ANTLR start "entryRuleDecision"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:992:1: entryRuleDecision returns [EObject current=null] : iv_ruleDecision= ruleDecision EOF ;
    public final EObject entryRuleDecision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecision = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:993:2: (iv_ruleDecision= ruleDecision EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:994:2: iv_ruleDecision= ruleDecision EOF
            {
             newCompositeNode(grammarAccess.getDecisionRule()); 
            pushFollow(FOLLOW_ruleDecision_in_entryRuleDecision1884);
            iv_ruleDecision=ruleDecision();

            state._fsp--;

             current =iv_ruleDecision; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecision1894); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1001:1: ruleDecision returns [EObject current=null] : (otherlv_0= 'Decision' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleDecision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1004:28: ( (otherlv_0= 'Decision' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1005:1: (otherlv_0= 'Decision' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1005:1: (otherlv_0= 'Decision' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1005:3: otherlv_0= 'Decision' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleDecision1931); 

                	newLeafNode(otherlv_0, grammarAccess.getDecisionAccess().getDecisionKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1009:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1010:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1010:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1011:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecision1948); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDecision1965); 

                	newLeafNode(otherlv_2, grammarAccess.getDecisionAccess().getSemicolonKeyword_2());
                

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1039:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1040:2: (iv_ruleStep= ruleStep EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1041:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep2001);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep2011); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1048:1: ruleStep returns [EObject current=null] : (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1051:28: ( (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1052:1: (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1052:1: (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1052:3: otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleStep2048); 

                	newLeafNode(otherlv_0, grammarAccess.getStepAccess().getStepKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1056:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1057:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1057:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1058:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStep2065); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStep2082); 

                	newLeafNode(otherlv_2, grammarAccess.getStepAccess().getSemicolonKeyword_2());
                

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1086:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1087:2: (iv_ruleTransition= ruleTransition EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1088:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition2118);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition2128); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1095:1: ruleTransition returns [EObject current=null] : (this_InitialTransition_0= ruleInitialTransition | this_FinalTransition_1= ruleFinalTransition | this_NonInitialTransition_2= ruleNonInitialTransition ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        EObject this_InitialTransition_0 = null;

        EObject this_FinalTransition_1 = null;

        EObject this_NonInitialTransition_2 = null;


         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1098:28: ( (this_InitialTransition_0= ruleInitialTransition | this_FinalTransition_1= ruleFinalTransition | this_NonInitialTransition_2= ruleNonInitialTransition ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1099:1: (this_InitialTransition_0= ruleInitialTransition | this_FinalTransition_1= ruleFinalTransition | this_NonInitialTransition_2= ruleNonInitialTransition )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1099:1: (this_InitialTransition_0= ruleInitialTransition | this_FinalTransition_1= ruleFinalTransition | this_NonInitialTransition_2= ruleNonInitialTransition )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_ID) ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==31) ) {
                        alt12=1;
                    }
                    else if ( (LA12_2==RULE_ID) ) {
                        int LA12_4 = input.LA(4);

                        if ( (LA12_4==32) ) {
                            int LA12_5 = input.LA(5);

                            if ( (LA12_5==33) ) {
                                alt12=2;
                            }
                            else if ( (LA12_5==RULE_ID) ) {
                                alt12=3;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 12, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1100:5: this_InitialTransition_0= ruleInitialTransition
                    {
                     
                            newCompositeNode(grammarAccess.getTransitionAccess().getInitialTransitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInitialTransition_in_ruleTransition2175);
                    this_InitialTransition_0=ruleInitialTransition();

                    state._fsp--;

                     
                            current = this_InitialTransition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1110:5: this_FinalTransition_1= ruleFinalTransition
                    {
                     
                            newCompositeNode(grammarAccess.getTransitionAccess().getFinalTransitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFinalTransition_in_ruleTransition2202);
                    this_FinalTransition_1=ruleFinalTransition();

                    state._fsp--;

                     
                            current = this_FinalTransition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1120:5: this_NonInitialTransition_2= ruleNonInitialTransition
                    {
                     
                            newCompositeNode(grammarAccess.getTransitionAccess().getNonInitialTransitionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNonInitialTransition_in_ruleTransition2229);
                    this_NonInitialTransition_2=ruleNonInitialTransition();

                    state._fsp--;

                     
                            current = this_NonInitialTransition_2; 
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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1136:1: entryRuleInitialTransition returns [EObject current=null] : iv_ruleInitialTransition= ruleInitialTransition EOF ;
    public final EObject entryRuleInitialTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialTransition = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1137:2: (iv_ruleInitialTransition= ruleInitialTransition EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1138:2: iv_ruleInitialTransition= ruleInitialTransition EOF
            {
             newCompositeNode(grammarAccess.getInitialTransitionRule()); 
            pushFollow(FOLLOW_ruleInitialTransition_in_entryRuleInitialTransition2264);
            iv_ruleInitialTransition=ruleInitialTransition();

            state._fsp--;

             current =iv_ruleInitialTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitialTransition2274); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1145:1: ruleInitialTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'initial' otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleInitialTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1148:28: ( (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'initial' otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1149:1: (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'initial' otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1149:1: (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'initial' otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1149:3: otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'initial' otherlv_3= '->' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleInitialTransition2311); 

                	newLeafNode(otherlv_0, grammarAccess.getInitialTransitionAccess().getTransitionKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1153:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1154:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1154:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1155:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInitialTransition2328); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInitialTransitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInitialTransitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleInitialTransition2345); 

                	newLeafNode(otherlv_2, grammarAccess.getInitialTransitionAccess().getInitialKeyword_2());
                
            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleInitialTransition2357); 

                	newLeafNode(otherlv_3, grammarAccess.getInitialTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1179:1: ( (otherlv_4= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1180:1: (otherlv_4= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1180:1: (otherlv_4= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1181:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInitialTransitionRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInitialTransition2377); 

            		newLeafNode(otherlv_4, grammarAccess.getInitialTransitionAccess().getToNodeCrossReference_4_0()); 
            	

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1200:1: entryRuleFinalTransition returns [EObject current=null] : iv_ruleFinalTransition= ruleFinalTransition EOF ;
    public final EObject entryRuleFinalTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinalTransition = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1201:2: (iv_ruleFinalTransition= ruleFinalTransition EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1202:2: iv_ruleFinalTransition= ruleFinalTransition EOF
            {
             newCompositeNode(grammarAccess.getFinalTransitionRule()); 
            pushFollow(FOLLOW_ruleFinalTransition_in_entryRuleFinalTransition2413);
            iv_ruleFinalTransition=ruleFinalTransition();

            state._fsp--;

             current =iv_ruleFinalTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFinalTransition2423); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1209:1: ruleFinalTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'final' ) ;
    public final EObject ruleFinalTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1212:28: ( (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'final' ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1213:1: (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'final' )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1213:1: (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'final' )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1213:3: otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'final'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleFinalTransition2460); 

                	newLeafNode(otherlv_0, grammarAccess.getFinalTransitionAccess().getTransitionKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1217:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1218:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1218:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1219:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFinalTransition2477); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFinalTransitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFinalTransitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1235:2: ( (otherlv_2= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1236:1: (otherlv_2= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1236:1: (otherlv_2= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1237:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFinalTransitionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFinalTransition2502); 

            		newLeafNode(otherlv_2, grammarAccess.getFinalTransitionAccess().getFromNodeCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleFinalTransition2514); 

                	newLeafNode(otherlv_3, grammarAccess.getFinalTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3());
                
            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleFinalTransition2526); 

                	newLeafNode(otherlv_4, grammarAccess.getFinalTransitionAccess().getFinalKeyword_4());
                

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


    // $ANTLR start "entryRuleNonInitialTransition"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1264:1: entryRuleNonInitialTransition returns [EObject current=null] : iv_ruleNonInitialTransition= ruleNonInitialTransition EOF ;
    public final EObject entryRuleNonInitialTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonInitialTransition = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1265:2: (iv_ruleNonInitialTransition= ruleNonInitialTransition EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1266:2: iv_ruleNonInitialTransition= ruleNonInitialTransition EOF
            {
             newCompositeNode(grammarAccess.getNonInitialTransitionRule()); 
            pushFollow(FOLLOW_ruleNonInitialTransition_in_entryRuleNonInitialTransition2562);
            iv_ruleNonInitialTransition=ruleNonInitialTransition();

            state._fsp--;

             current =iv_ruleNonInitialTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonInitialTransition2572); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1273:1: ruleNonInitialTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleNonInitialTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1276:28: ( (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1277:1: (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1277:1: (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1277:3: otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleNonInitialTransition2609); 

                	newLeafNode(otherlv_0, grammarAccess.getNonInitialTransitionAccess().getTransitionKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1281:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1282:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1282:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1283:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNonInitialTransition2626); 

            			newLeafNode(lv_name_1_0, grammarAccess.getNonInitialTransitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNonInitialTransitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1299:2: ( (otherlv_2= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1300:1: (otherlv_2= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1300:1: (otherlv_2= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1301:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNonInitialTransitionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNonInitialTransition2651); 

            		newLeafNode(otherlv_2, grammarAccess.getNonInitialTransitionAccess().getFromNodeCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleNonInitialTransition2663); 

                	newLeafNode(otherlv_3, grammarAccess.getNonInitialTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1316:1: ( (otherlv_4= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1317:1: (otherlv_4= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1317:1: (otherlv_4= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1318:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNonInitialTransitionRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNonInitialTransition2683); 

            		newLeafNode(otherlv_4, grammarAccess.getNonInitialTransitionAccess().getToNodeCrossReference_4_0()); 
            	

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1337:1: entryRuleTextfield returns [EObject current=null] : iv_ruleTextfield= ruleTextfield EOF ;
    public final EObject entryRuleTextfield() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextfield = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1338:2: (iv_ruleTextfield= ruleTextfield EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1339:2: iv_ruleTextfield= ruleTextfield EOF
            {
             newCompositeNode(grammarAccess.getTextfieldRule()); 
            pushFollow(FOLLOW_ruleTextfield_in_entryRuleTextfield2719);
            iv_ruleTextfield=ruleTextfield();

            state._fsp--;

             current =iv_ruleTextfield; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextfield2729); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1346:1: ruleTextfield returns [EObject current=null] : ( (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) )? otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? ) ;
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
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1349:28: ( ( (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) )? otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1350:1: ( (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) )? otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1350:1: ( (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) )? otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1350:2: (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) )? otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1350:2: (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1350:4: otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleTextfield2767); 

                        	newLeafNode(otherlv_0, grammarAccess.getTextfieldAccess().getLabelKeyword_0_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1354:1: ( (lv_label_1_0= RULE_STRING ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1355:1: (lv_label_1_0= RULE_STRING )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1355:1: (lv_label_1_0= RULE_STRING )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1356:3: lv_label_1_0= RULE_STRING
                    {
                    lv_label_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextfield2784); 

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

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleTextfield2803); 

                	newLeafNode(otherlv_2, grammarAccess.getTextfieldAccess().getSummaryKeyword_1());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1376:1: ( (lv_summary_3_0= RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1377:1: (lv_summary_3_0= RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1377:1: (lv_summary_3_0= RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1378:3: lv_summary_3_0= RULE_STRING
            {
            lv_summary_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextfield2820); 

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

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1394:2: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==36) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1394:4: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleTextfield2838); 

                        	newLeafNode(otherlv_4, grammarAccess.getTextfieldAccess().getDescriptionKeyword_3_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1398:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1399:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1399:1: (lv_description_5_0= RULE_STRING )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1400:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextfield2855); 

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
    public static final BitSet FOLLOW_ruleActivity_in_ruleModel131 = new BitSet(new long[]{0x0000000000076802L});
    public static final BitSet FOLLOW_ruleRole_in_ruleModel158 = new BitSet(new long[]{0x0000000000076802L});
    public static final BitSet FOLLOW_ruleWorkProduct_in_ruleModel185 = new BitSet(new long[]{0x0000000000076802L});
    public static final BitSet FOLLOW_ruleWorkProductType_in_ruleModel212 = new BitSet(new long[]{0x0000000000076802L});
    public static final BitSet FOLLOW_ruleGuidance_in_ruleModel239 = new BitSet(new long[]{0x0000000000076802L});
    public static final BitSet FOLLOW_ruleGuidanceType_in_ruleModel266 = new BitSet(new long[]{0x0000000000076802L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleRole352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole369 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_ruleTextfield_in_ruleRole395 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRole407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkProductType_in_entryRuleWorkProductType443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkProductType453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleWorkProductType490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkProductType507 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_ruleTextfield_in_ruleWorkProductType533 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleWorkProductType545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkProduct_in_entryRuleWorkProduct581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkProduct591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleWorkProduct628 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkProduct645 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleWorkProduct662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkProduct682 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_ruleTextfield_in_ruleWorkProduct703 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleWorkProduct715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidanceType_in_entryRuleGuidanceType751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuidanceType761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleGuidanceType798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGuidanceType815 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_ruleTextfield_in_ruleGuidanceType841 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGuidanceType853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidance_in_entryRuleGuidance889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuidance899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleGuidance936 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGuidance953 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleGuidance970 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGuidance990 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_ruleTextfield_in_ruleGuidance1011 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGuidance1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort1059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePort1111 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePort1128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePort1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity1184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleActivity1231 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity1248 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_ruleTextfield_in_ruleActivity1274 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActivity1286 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity1306 = new BitSet(new long[]{0x0000000003D01000L});
    public static final BitSet FOLLOW_20_in_ruleActivity1319 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePort_in_ruleActivity1340 = new BitSet(new long[]{0x0000000003E01000L});
    public static final BitSet FOLLOW_21_in_ruleActivity1353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePort_in_ruleActivity1374 = new BitSet(new long[]{0x0000000003E01000L});
    public static final BitSet FOLLOW_22_in_ruleActivity1391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePort_in_ruleActivity1412 = new BitSet(new long[]{0x0000000003A01000L});
    public static final BitSet FOLLOW_21_in_ruleActivity1425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePort_in_ruleActivity1446 = new BitSet(new long[]{0x0000000003A01000L});
    public static final BitSet FOLLOW_23_in_ruleActivity1463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleActivityRef_in_ruleActivity1484 = new BitSet(new long[]{0x0000000003201000L});
    public static final BitSet FOLLOW_21_in_ruleActivity1497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleActivityRef_in_ruleActivity1518 = new BitSet(new long[]{0x0000000003201000L});
    public static final BitSet FOLLOW_24_in_ruleActivity1535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity1555 = new BitSet(new long[]{0x0000000002201000L});
    public static final BitSet FOLLOW_21_in_ruleActivity1568 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity1588 = new BitSet(new long[]{0x0000000002201000L});
    public static final BitSet FOLLOW_25_in_ruleActivity1605 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleActivity1617 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_ruleStep_in_ruleActivity1639 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_ruleDecision_in_ruleActivity1666 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleActivity1693 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_27_in_ruleActivity1707 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActivity1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityRef_in_entryRuleActivityRef1757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityRef1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivityRef1809 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleActivityRef1826 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivityRef1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecision_in_entryRuleDecision1884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecision1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDecision1931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecision1948 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDecision1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep2001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleStep2048 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStep2065 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStep2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition2118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialTransition_in_ruleTransition2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFinalTransition_in_ruleTransition2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonInitialTransition_in_ruleTransition2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialTransition_in_entryRuleInitialTransition2264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitialTransition2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleInitialTransition2311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInitialTransition2328 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleInitialTransition2345 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleInitialTransition2357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInitialTransition2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFinalTransition_in_entryRuleFinalTransition2413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFinalTransition2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFinalTransition2460 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFinalTransition2477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFinalTransition2502 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleFinalTransition2514 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleFinalTransition2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonInitialTransition_in_entryRuleNonInitialTransition2562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonInitialTransition2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleNonInitialTransition2609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNonInitialTransition2626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNonInitialTransition2651 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleNonInitialTransition2663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNonInitialTransition2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_entryRuleTextfield2719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextfield2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleTextfield2767 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextfield2784 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleTextfield2803 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextfield2820 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleTextfield2838 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextfield2855 = new BitSet(new long[]{0x0000000000000002L});

}