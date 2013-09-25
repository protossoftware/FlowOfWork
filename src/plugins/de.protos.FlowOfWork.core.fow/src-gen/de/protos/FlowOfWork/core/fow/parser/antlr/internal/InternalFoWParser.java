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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Role'", "';'", "'WorkProductType'", "'WorkProduct'", "':'", "'states'", "','", "'GuidanceType'", "'Guidance'", "'('", "')'", "'Activity'", "'responsible'", "'inputs'", "'outputs'", "'subActivities'", "'guidances'", "'Behavior'", "'{'", "'}'", "'Decision'", "'Step'", "'Transition'", "'initial'", "'to'", "'final'", "'label'", "'summary'", "'description'"
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
                case 22:
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
                case 19:
                    {
                    alt1=5;
                    }
                    break;
                case 18:
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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:342:1: ruleWorkProduct returns [EObject current=null] : (otherlv_0= 'WorkProduct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) (otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* )? otherlv_9= ';' ) ;
    public final EObject ruleWorkProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_textfield_4_0 = null;

        EObject lv_states_6_0 = null;

        EObject lv_states_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:345:28: ( (otherlv_0= 'WorkProduct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) (otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* )? otherlv_9= ';' ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:346:1: (otherlv_0= 'WorkProduct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) (otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* )? otherlv_9= ';' )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:346:1: (otherlv_0= 'WorkProduct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) (otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* )? otherlv_9= ';' )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:346:3: otherlv_0= 'WorkProduct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) (otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* )? otherlv_9= ';'
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

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:403:2: (otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:403:4: otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )*
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleWorkProduct716); 

                        	newLeafNode(otherlv_5, grammarAccess.getWorkProductAccess().getStatesKeyword_5_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:407:1: ( (lv_states_6_0= ruleState ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:408:1: (lv_states_6_0= ruleState )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:408:1: (lv_states_6_0= ruleState )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:409:3: lv_states_6_0= ruleState
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkProductAccess().getStatesStateParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleState_in_ruleWorkProduct737);
                    lv_states_6_0=ruleState();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkProductRule());
                    	        }
                           		add(
                           			current, 
                           			"states",
                            		lv_states_6_0, 
                            		"State");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:425:2: (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==17) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:425:4: otherlv_7= ',' ( (lv_states_8_0= ruleState ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleWorkProduct750); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getWorkProductAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:429:1: ( (lv_states_8_0= ruleState ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:430:1: (lv_states_8_0= ruleState )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:430:1: (lv_states_8_0= ruleState )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:431:3: lv_states_8_0= ruleState
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkProductAccess().getStatesStateParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleState_in_ruleWorkProduct771);
                    	    lv_states_8_0=ruleState();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWorkProductRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"states",
                    	            		lv_states_8_0, 
                    	            		"State");
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

            otherlv_9=(Token)match(input,12,FOLLOW_12_in_ruleWorkProduct787); 

                	newLeafNode(otherlv_9, grammarAccess.getWorkProductAccess().getSemicolonKeyword_6());
                

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:459:1: entryRuleGuidanceType returns [EObject current=null] : iv_ruleGuidanceType= ruleGuidanceType EOF ;
    public final EObject entryRuleGuidanceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidanceType = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:460:2: (iv_ruleGuidanceType= ruleGuidanceType EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:461:2: iv_ruleGuidanceType= ruleGuidanceType EOF
            {
             newCompositeNode(grammarAccess.getGuidanceTypeRule()); 
            pushFollow(FOLLOW_ruleGuidanceType_in_entryRuleGuidanceType823);
            iv_ruleGuidanceType=ruleGuidanceType();

            state._fsp--;

             current =iv_ruleGuidanceType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuidanceType833); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:468:1: ruleGuidanceType returns [EObject current=null] : (otherlv_0= 'GuidanceType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' ) ;
    public final EObject ruleGuidanceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_textfield_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:471:28: ( (otherlv_0= 'GuidanceType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:472:1: (otherlv_0= 'GuidanceType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:472:1: (otherlv_0= 'GuidanceType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';' )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:472:3: otherlv_0= 'GuidanceType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleGuidanceType870); 

                	newLeafNode(otherlv_0, grammarAccess.getGuidanceTypeAccess().getGuidanceTypeKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:476:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:477:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:477:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:478:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGuidanceType887); 

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

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:494:2: ( (lv_textfield_2_0= ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:495:1: (lv_textfield_2_0= ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:495:1: (lv_textfield_2_0= ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:496:3: lv_textfield_2_0= ruleTextfield
            {
             
            	        newCompositeNode(grammarAccess.getGuidanceTypeAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTextfield_in_ruleGuidanceType913);
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleGuidanceType925); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:524:1: entryRuleGuidance returns [EObject current=null] : iv_ruleGuidance= ruleGuidance EOF ;
    public final EObject entryRuleGuidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidance = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:525:2: (iv_ruleGuidance= ruleGuidance EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:526:2: iv_ruleGuidance= ruleGuidance EOF
            {
             newCompositeNode(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_ruleGuidance_in_entryRuleGuidance961);
            iv_ruleGuidance=ruleGuidance();

            state._fsp--;

             current =iv_ruleGuidance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuidance971); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:533:1: ruleGuidance returns [EObject current=null] : (otherlv_0= 'Guidance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) otherlv_5= ';' ) ;
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
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:536:28: ( (otherlv_0= 'Guidance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) otherlv_5= ';' ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:537:1: (otherlv_0= 'Guidance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) otherlv_5= ';' )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:537:1: (otherlv_0= 'Guidance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) otherlv_5= ';' )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:537:3: otherlv_0= 'Guidance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleGuidance1008); 

                	newLeafNode(otherlv_0, grammarAccess.getGuidanceAccess().getGuidanceKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:541:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:542:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:542:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:543:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGuidance1025); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleGuidance1042); 

                	newLeafNode(otherlv_2, grammarAccess.getGuidanceAccess().getColonKeyword_2());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:563:1: ( (otherlv_3= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:564:1: (otherlv_3= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:564:1: (otherlv_3= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:565:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGuidanceRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGuidance1062); 

            		newLeafNode(otherlv_3, grammarAccess.getGuidanceAccess().getTypeGuidanceTypeCrossReference_3_0()); 
            	

            }


            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:576:2: ( (lv_textfield_4_0= ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:577:1: (lv_textfield_4_0= ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:577:1: (lv_textfield_4_0= ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:578:3: lv_textfield_4_0= ruleTextfield
            {
             
            	        newCompositeNode(grammarAccess.getGuidanceAccess().getTextfieldTextfieldParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTextfield_in_ruleGuidance1083);
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

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleGuidance1095); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:606:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:607:2: (iv_ruleState= ruleState EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:608:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState1131);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState1141); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:615:1: ruleState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:618:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:619:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:619:1: ( (lv_name_0_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:620:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:620:1: (lv_name_0_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:621:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState1182); 

            			newLeafNode(lv_name_0_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRulePort"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:645:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:646:2: (iv_rulePort= rulePort EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:647:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort1222);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort1232); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:654:1: rulePort returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )? ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:657:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )? ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:658:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )? )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:658:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )? )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:658:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )?
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:658:2: ( (otherlv_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:659:1: (otherlv_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:659:1: (otherlv_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:660:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPortRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePort1277); 

            		newLeafNode(otherlv_0, grammarAccess.getPortAccess().getTypeWorkProductCrossReference_0_0()); 
            	

            }


            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:671:2: (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:671:4: otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_rulePort1290); 

                        	newLeafNode(otherlv_1, grammarAccess.getPortAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:675:1: ( (otherlv_2= RULE_ID ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:676:1: (otherlv_2= RULE_ID )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:676:1: (otherlv_2= RULE_ID )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:677:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPortRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePort1310); 

                    		newLeafNode(otherlv_2, grammarAccess.getPortAccess().getStateStateCrossReference_1_1_0()); 
                    	

                    }


                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_rulePort1322); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:700:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:701:2: (iv_ruleActivity= ruleActivity EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:702:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity1360);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity1370); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:709:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= 'responsible' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )* )? (otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )* )? (otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )* )? (otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? (otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}' )? otherlv_27= ';' ) ;
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
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:712:28: ( (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= 'responsible' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )* )? (otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )* )? (otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )* )? (otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? (otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}' )? otherlv_27= ';' ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:713:1: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= 'responsible' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )* )? (otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )* )? (otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )* )? (otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? (otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}' )? otherlv_27= ';' )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:713:1: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= 'responsible' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )* )? (otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )* )? (otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )* )? (otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? (otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}' )? otherlv_27= ';' )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:713:3: otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= 'responsible' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )* )? (otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )* )? (otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )* )? (otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? (otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}' )? otherlv_27= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleActivity1407); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:717:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:718:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:718:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:719:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity1424); 

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

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:735:2: ( (lv_textfield_2_0= ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:736:1: (lv_textfield_2_0= ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:736:1: (lv_textfield_2_0= ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:737:3: lv_textfield_2_0= ruleTextfield
            {
             
            	        newCompositeNode(grammarAccess.getActivityAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTextfield_in_ruleActivity1450);
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

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleActivity1462); 

                	newLeafNode(otherlv_3, grammarAccess.getActivityAccess().getResponsibleKeyword_3());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:757:1: ( (otherlv_4= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:758:1: (otherlv_4= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:758:1: (otherlv_4= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:759:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity1482); 

            		newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getRoleRoleCrossReference_4_0()); 
            	

            }


            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:770:2: (otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:770:4: otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )*
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleActivity1495); 

                        	newLeafNode(otherlv_5, grammarAccess.getActivityAccess().getInputsKeyword_5_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:774:1: ( (lv_inPorts_6_0= rulePort ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:775:1: (lv_inPorts_6_0= rulePort )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:775:1: (lv_inPorts_6_0= rulePort )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:776:3: lv_inPorts_6_0= rulePort
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getInPortsPortParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePort_in_ruleActivity1516);
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

                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:792:2: (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:792:4: otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleActivity1529); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getActivityAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:796:1: ( (lv_inPorts_8_0= rulePort ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:797:1: (lv_inPorts_8_0= rulePort )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:797:1: (lv_inPorts_8_0= rulePort )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:798:3: lv_inPorts_8_0= rulePort
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getInPortsPortParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePort_in_ruleActivity1550);
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
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:814:6: (otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:814:8: otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )*
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_25_in_ruleActivity1567); 

                        	newLeafNode(otherlv_9, grammarAccess.getActivityAccess().getOutputsKeyword_6_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:818:1: ( (lv_outPorts_10_0= rulePort ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:819:1: (lv_outPorts_10_0= rulePort )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:819:1: (lv_outPorts_10_0= rulePort )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:820:3: lv_outPorts_10_0= rulePort
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getOutPortsPortParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePort_in_ruleActivity1588);
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

                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:836:2: (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==17) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:836:4: otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleActivity1601); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getActivityAccess().getCommaKeyword_6_2_0());
                    	        
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:840:1: ( (lv_outPorts_12_0= rulePort ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:841:1: (lv_outPorts_12_0= rulePort )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:841:1: (lv_outPorts_12_0= rulePort )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:842:3: lv_outPorts_12_0= rulePort
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getOutPortsPortParserRuleCall_6_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePort_in_ruleActivity1622);
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
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:858:6: (otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:858:8: otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )*
                    {
                    otherlv_13=(Token)match(input,26,FOLLOW_26_in_ruleActivity1639); 

                        	newLeafNode(otherlv_13, grammarAccess.getActivityAccess().getSubActivitiesKeyword_7_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:862:1: ( (lv_subActivities_14_0= ruleActivityRef ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:863:1: (lv_subActivities_14_0= ruleActivityRef )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:863:1: (lv_subActivities_14_0= ruleActivityRef )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:864:3: lv_subActivities_14_0= ruleActivityRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getSubActivitiesActivityRefParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActivityRef_in_ruleActivity1660);
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

                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:880:2: (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==17) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:880:4: otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) )
                    	    {
                    	    otherlv_15=(Token)match(input,17,FOLLOW_17_in_ruleActivity1673); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getActivityAccess().getCommaKeyword_7_2_0());
                    	        
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:884:1: ( (lv_subActivities_16_0= ruleActivityRef ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:885:1: (lv_subActivities_16_0= ruleActivityRef )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:885:1: (lv_subActivities_16_0= ruleActivityRef )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:886:3: lv_subActivities_16_0= ruleActivityRef
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getSubActivitiesActivityRefParserRuleCall_7_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleActivityRef_in_ruleActivity1694);
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
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:902:6: (otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:902:8: otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )*
                    {
                    otherlv_17=(Token)match(input,27,FOLLOW_27_in_ruleActivity1711); 

                        	newLeafNode(otherlv_17, grammarAccess.getActivityAccess().getGuidancesKeyword_8_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:906:1: ( (otherlv_18= RULE_ID ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:907:1: (otherlv_18= RULE_ID )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:907:1: (otherlv_18= RULE_ID )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:908:3: otherlv_18= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                            
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity1731); 

                    		newLeafNode(otherlv_18, grammarAccess.getActivityAccess().getGuidancesGuidanceCrossReference_8_1_0()); 
                    	

                    }


                    }

                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:919:2: (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==17) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:919:4: otherlv_19= ',' ( (otherlv_20= RULE_ID ) )
                    	    {
                    	    otherlv_19=(Token)match(input,17,FOLLOW_17_in_ruleActivity1744); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getActivityAccess().getCommaKeyword_8_2_0());
                    	        
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:923:1: ( (otherlv_20= RULE_ID ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:924:1: (otherlv_20= RULE_ID )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:924:1: (otherlv_20= RULE_ID )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:925:3: otherlv_20= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActivityRule());
                    	    	        }
                    	            
                    	    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity1764); 

                    	    		newLeafNode(otherlv_20, grammarAccess.getActivityAccess().getGuidancesGuidanceCrossReference_8_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:936:6: (otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:936:8: otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,28,FOLLOW_28_in_ruleActivity1781); 

                        	newLeafNode(otherlv_21, grammarAccess.getActivityAccess().getBehaviorKeyword_9_0());
                        
                    otherlv_22=(Token)match(input,29,FOLLOW_29_in_ruleActivity1793); 

                        	newLeafNode(otherlv_22, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:944:1: ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )*
                    loop13:
                    do {
                        int alt13=4;
                        switch ( input.LA(1) ) {
                        case 32:
                            {
                            alt13=1;
                            }
                            break;
                        case 31:
                            {
                            alt13=2;
                            }
                            break;
                        case 33:
                            {
                            alt13=3;
                            }
                            break;

                        }

                        switch (alt13) {
                    	case 1 :
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:944:2: ( (lv_steps_23_0= ruleStep ) )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:944:2: ( (lv_steps_23_0= ruleStep ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:945:1: (lv_steps_23_0= ruleStep )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:945:1: (lv_steps_23_0= ruleStep )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:946:3: lv_steps_23_0= ruleStep
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getStepsStepParserRuleCall_9_2_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStep_in_ruleActivity1815);
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
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:963:6: ( (lv_decisions_24_0= ruleDecision ) )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:963:6: ( (lv_decisions_24_0= ruleDecision ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:964:1: (lv_decisions_24_0= ruleDecision )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:964:1: (lv_decisions_24_0= ruleDecision )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:965:3: lv_decisions_24_0= ruleDecision
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getDecisionsDecisionParserRuleCall_9_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDecision_in_ruleActivity1842);
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
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:982:6: ( (lv_transitions_25_0= ruleTransition ) )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:982:6: ( (lv_transitions_25_0= ruleTransition ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:983:1: (lv_transitions_25_0= ruleTransition )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:983:1: (lv_transitions_25_0= ruleTransition )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:984:3: lv_transitions_25_0= ruleTransition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getTransitionsTransitionParserRuleCall_9_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTransition_in_ruleActivity1869);
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
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,30,FOLLOW_30_in_ruleActivity1883); 

                        	newLeafNode(otherlv_26, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_9_3());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,12,FOLLOW_12_in_ruleActivity1897); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1016:1: entryRuleActivityRef returns [EObject current=null] : iv_ruleActivityRef= ruleActivityRef EOF ;
    public final EObject entryRuleActivityRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityRef = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1017:2: (iv_ruleActivityRef= ruleActivityRef EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1018:2: iv_ruleActivityRef= ruleActivityRef EOF
            {
             newCompositeNode(grammarAccess.getActivityRefRule()); 
            pushFollow(FOLLOW_ruleActivityRef_in_entryRuleActivityRef1933);
            iv_ruleActivityRef=ruleActivityRef();

            state._fsp--;

             current =iv_ruleActivityRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityRef1943); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1025:1: ruleActivityRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleActivityRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1028:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1029:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1029:1: ( (otherlv_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1030:1: (otherlv_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1030:1: (otherlv_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1031:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivityRef1987); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1052:1: entryRuleDecision returns [EObject current=null] : iv_ruleDecision= ruleDecision EOF ;
    public final EObject entryRuleDecision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecision = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1053:2: (iv_ruleDecision= ruleDecision EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1054:2: iv_ruleDecision= ruleDecision EOF
            {
             newCompositeNode(grammarAccess.getDecisionRule()); 
            pushFollow(FOLLOW_ruleDecision_in_entryRuleDecision2024);
            iv_ruleDecision=ruleDecision();

            state._fsp--;

             current =iv_ruleDecision; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecision2034); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1061:1: ruleDecision returns [EObject current=null] : (otherlv_0= 'Decision' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleDecision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_label_2_0=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1064:28: ( (otherlv_0= 'Decision' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1065:1: (otherlv_0= 'Decision' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1065:1: (otherlv_0= 'Decision' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1065:3: otherlv_0= 'Decision' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleDecision2071); 

                	newLeafNode(otherlv_0, grammarAccess.getDecisionAccess().getDecisionKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1069:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1070:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1070:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1071:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecision2088); 

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

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1087:2: ( (lv_label_2_0= RULE_STRING ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1088:1: (lv_label_2_0= RULE_STRING )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1088:1: (lv_label_2_0= RULE_STRING )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1089:3: lv_label_2_0= RULE_STRING
                    {
                    lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecision2110); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1113:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1114:2: (iv_ruleStep= ruleStep EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1115:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep2152);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep2162); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1122:1: ruleStep returns [EObject current=null] : (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_label_2_0=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1125:28: ( (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1126:1: (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1126:1: (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1126:3: otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleStep2199); 

                	newLeafNode(otherlv_0, grammarAccess.getStepAccess().getStepKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1130:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1131:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1131:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1132:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStep2216); 

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

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1148:2: ( (lv_label_2_0= RULE_STRING ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1149:1: (lv_label_2_0= RULE_STRING )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1149:1: (lv_label_2_0= RULE_STRING )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1150:3: lv_label_2_0= RULE_STRING
                    {
                    lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStep2238); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1174:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1175:2: (iv_ruleTransition= ruleTransition EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1176:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition2280);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition2290); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1183:1: ruleTransition returns [EObject current=null] : (this_InitialTransition_0= ruleInitialTransition | this_FinalTransition_1= ruleFinalTransition | this_NonInitialTransition_2= ruleNonInitialTransition | this_DecisionTransition_3= ruleDecisionTransition ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        EObject this_InitialTransition_0 = null;

        EObject this_FinalTransition_1 = null;

        EObject this_NonInitialTransition_2 = null;

        EObject this_DecisionTransition_3 = null;


         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1186:28: ( (this_InitialTransition_0= ruleInitialTransition | this_FinalTransition_1= ruleFinalTransition | this_NonInitialTransition_2= ruleNonInitialTransition | this_DecisionTransition_3= ruleDecisionTransition ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1187:1: (this_InitialTransition_0= ruleInitialTransition | this_FinalTransition_1= ruleFinalTransition | this_NonInitialTransition_2= ruleNonInitialTransition | this_DecisionTransition_3= ruleDecisionTransition )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1187:1: (this_InitialTransition_0= ruleInitialTransition | this_FinalTransition_1= ruleFinalTransition | this_NonInitialTransition_2= ruleNonInitialTransition | this_DecisionTransition_3= ruleDecisionTransition )
            int alt17=4;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==RULE_ID) ) {
                    int LA17_2 = input.LA(3);

                    if ( (LA17_2==35) ) {
                        int LA17_4 = input.LA(4);

                        if ( (LA17_4==36) ) {
                            alt17=2;
                        }
                        else if ( (LA17_4==RULE_ID) ) {
                            int LA17_6 = input.LA(5);

                            if ( (LA17_6==EOF||(LA17_6>=30 && LA17_6<=33)) ) {
                                alt17=3;
                            }
                            else if ( (LA17_6==RULE_STRING) ) {
                                alt17=4;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 17, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA17_1==34) ) {
                    alt17=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1188:5: this_InitialTransition_0= ruleInitialTransition
                    {
                     
                            newCompositeNode(grammarAccess.getTransitionAccess().getInitialTransitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInitialTransition_in_ruleTransition2337);
                    this_InitialTransition_0=ruleInitialTransition();

                    state._fsp--;

                     
                            current = this_InitialTransition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1198:5: this_FinalTransition_1= ruleFinalTransition
                    {
                     
                            newCompositeNode(grammarAccess.getTransitionAccess().getFinalTransitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFinalTransition_in_ruleTransition2364);
                    this_FinalTransition_1=ruleFinalTransition();

                    state._fsp--;

                     
                            current = this_FinalTransition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1208:5: this_NonInitialTransition_2= ruleNonInitialTransition
                    {
                     
                            newCompositeNode(grammarAccess.getTransitionAccess().getNonInitialTransitionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNonInitialTransition_in_ruleTransition2391);
                    this_NonInitialTransition_2=ruleNonInitialTransition();

                    state._fsp--;

                     
                            current = this_NonInitialTransition_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1218:5: this_DecisionTransition_3= ruleDecisionTransition
                    {
                     
                            newCompositeNode(grammarAccess.getTransitionAccess().getDecisionTransitionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDecisionTransition_in_ruleTransition2418);
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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1234:1: entryRuleInitialTransition returns [EObject current=null] : iv_ruleInitialTransition= ruleInitialTransition EOF ;
    public final EObject entryRuleInitialTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialTransition = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1235:2: (iv_ruleInitialTransition= ruleInitialTransition EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1236:2: iv_ruleInitialTransition= ruleInitialTransition EOF
            {
             newCompositeNode(grammarAccess.getInitialTransitionRule()); 
            pushFollow(FOLLOW_ruleInitialTransition_in_entryRuleInitialTransition2453);
            iv_ruleInitialTransition=ruleInitialTransition();

            state._fsp--;

             current =iv_ruleInitialTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitialTransition2463); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1243:1: ruleInitialTransition returns [EObject current=null] : (otherlv_0= 'Transition' otherlv_1= 'initial' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleInitialTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1246:28: ( (otherlv_0= 'Transition' otherlv_1= 'initial' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1247:1: (otherlv_0= 'Transition' otherlv_1= 'initial' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1247:1: (otherlv_0= 'Transition' otherlv_1= 'initial' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1247:3: otherlv_0= 'Transition' otherlv_1= 'initial' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleInitialTransition2500); 

                	newLeafNode(otherlv_0, grammarAccess.getInitialTransitionAccess().getTransitionKeyword_0());
                
            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleInitialTransition2512); 

                	newLeafNode(otherlv_1, grammarAccess.getInitialTransitionAccess().getInitialKeyword_1());
                
            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleInitialTransition2524); 

                	newLeafNode(otherlv_2, grammarAccess.getInitialTransitionAccess().getToKeyword_2());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1259:1: ( (otherlv_3= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1260:1: (otherlv_3= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1260:1: (otherlv_3= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1261:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInitialTransitionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInitialTransition2544); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1280:1: entryRuleFinalTransition returns [EObject current=null] : iv_ruleFinalTransition= ruleFinalTransition EOF ;
    public final EObject entryRuleFinalTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinalTransition = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1281:2: (iv_ruleFinalTransition= ruleFinalTransition EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1282:2: iv_ruleFinalTransition= ruleFinalTransition EOF
            {
             newCompositeNode(grammarAccess.getFinalTransitionRule()); 
            pushFollow(FOLLOW_ruleFinalTransition_in_entryRuleFinalTransition2580);
            iv_ruleFinalTransition=ruleFinalTransition();

            state._fsp--;

             current =iv_ruleFinalTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFinalTransition2590); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1289:1: ruleFinalTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' otherlv_3= 'final' ) ;
    public final EObject ruleFinalTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1292:28: ( (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' otherlv_3= 'final' ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1293:1: (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' otherlv_3= 'final' )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1293:1: (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' otherlv_3= 'final' )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1293:3: otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' otherlv_3= 'final'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleFinalTransition2627); 

                	newLeafNode(otherlv_0, grammarAccess.getFinalTransitionAccess().getTransitionKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1297:1: ( (otherlv_1= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1298:1: (otherlv_1= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1298:1: (otherlv_1= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1299:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFinalTransitionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFinalTransition2647); 

            		newLeafNode(otherlv_1, grammarAccess.getFinalTransitionAccess().getFromNodeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleFinalTransition2659); 

                	newLeafNode(otherlv_2, grammarAccess.getFinalTransitionAccess().getToKeyword_2());
                
            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleFinalTransition2671); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1326:1: entryRuleDecisionTransition returns [EObject current=null] : iv_ruleDecisionTransition= ruleDecisionTransition EOF ;
    public final EObject entryRuleDecisionTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecisionTransition = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1327:2: (iv_ruleDecisionTransition= ruleDecisionTransition EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1328:2: iv_ruleDecisionTransition= ruleDecisionTransition EOF
            {
             newCompositeNode(grammarAccess.getDecisionTransitionRule()); 
            pushFollow(FOLLOW_ruleDecisionTransition_in_entryRuleDecisionTransition2707);
            iv_ruleDecisionTransition=ruleDecisionTransition();

            state._fsp--;

             current =iv_ruleDecisionTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecisionTransition2717); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1335:1: ruleDecisionTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ( (lv_guard_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleDecisionTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_guard_4_0=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1338:28: ( (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ( (lv_guard_4_0= RULE_STRING ) ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1339:1: (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ( (lv_guard_4_0= RULE_STRING ) ) )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1339:1: (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ( (lv_guard_4_0= RULE_STRING ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1339:3: otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ( (lv_guard_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleDecisionTransition2754); 

                	newLeafNode(otherlv_0, grammarAccess.getDecisionTransitionAccess().getTransitionKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1343:1: ( (otherlv_1= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1344:1: (otherlv_1= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1344:1: (otherlv_1= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1345:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDecisionTransitionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecisionTransition2774); 

            		newLeafNode(otherlv_1, grammarAccess.getDecisionTransitionAccess().getFromDecisionCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleDecisionTransition2786); 

                	newLeafNode(otherlv_2, grammarAccess.getDecisionTransitionAccess().getToKeyword_2());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1360:1: ( (otherlv_3= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1361:1: (otherlv_3= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1361:1: (otherlv_3= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1362:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDecisionTransitionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecisionTransition2806); 

            		newLeafNode(otherlv_3, grammarAccess.getDecisionTransitionAccess().getToNodeCrossReference_3_0()); 
            	

            }


            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1373:2: ( (lv_guard_4_0= RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1374:1: (lv_guard_4_0= RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1374:1: (lv_guard_4_0= RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1375:3: lv_guard_4_0= RULE_STRING
            {
            lv_guard_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecisionTransition2823); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1399:1: entryRuleNonInitialTransition returns [EObject current=null] : iv_ruleNonInitialTransition= ruleNonInitialTransition EOF ;
    public final EObject entryRuleNonInitialTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonInitialTransition = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1400:2: (iv_ruleNonInitialTransition= ruleNonInitialTransition EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1401:2: iv_ruleNonInitialTransition= ruleNonInitialTransition EOF
            {
             newCompositeNode(grammarAccess.getNonInitialTransitionRule()); 
            pushFollow(FOLLOW_ruleNonInitialTransition_in_entryRuleNonInitialTransition2864);
            iv_ruleNonInitialTransition=ruleNonInitialTransition();

            state._fsp--;

             current =iv_ruleNonInitialTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonInitialTransition2874); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1408:1: ruleNonInitialTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleNonInitialTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1411:28: ( (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1412:1: (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1412:1: (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1412:3: otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleNonInitialTransition2911); 

                	newLeafNode(otherlv_0, grammarAccess.getNonInitialTransitionAccess().getTransitionKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1416:1: ( (otherlv_1= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1417:1: (otherlv_1= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1417:1: (otherlv_1= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1418:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNonInitialTransitionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNonInitialTransition2931); 

            		newLeafNode(otherlv_1, grammarAccess.getNonInitialTransitionAccess().getFromNodeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleNonInitialTransition2943); 

                	newLeafNode(otherlv_2, grammarAccess.getNonInitialTransitionAccess().getToKeyword_2());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1433:1: ( (otherlv_3= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1434:1: (otherlv_3= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1434:1: (otherlv_3= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1435:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNonInitialTransitionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNonInitialTransition2963); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1454:1: entryRuleTextfield returns [EObject current=null] : iv_ruleTextfield= ruleTextfield EOF ;
    public final EObject entryRuleTextfield() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextfield = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1455:2: (iv_ruleTextfield= ruleTextfield EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1456:2: iv_ruleTextfield= ruleTextfield EOF
            {
             newCompositeNode(grammarAccess.getTextfieldRule()); 
            pushFollow(FOLLOW_ruleTextfield_in_entryRuleTextfield2999);
            iv_ruleTextfield=ruleTextfield();

            state._fsp--;

             current =iv_ruleTextfield; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextfield3009); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1463:1: ruleTextfield returns [EObject current=null] : ( (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) )? otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? ) ;
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
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1466:28: ( ( (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) )? otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1467:1: ( (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) )? otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1467:1: ( (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) )? otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1467:2: (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) )? otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1467:2: (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1467:4: otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleTextfield3047); 

                        	newLeafNode(otherlv_0, grammarAccess.getTextfieldAccess().getLabelKeyword_0_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1471:1: ( (lv_label_1_0= RULE_STRING ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1472:1: (lv_label_1_0= RULE_STRING )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1472:1: (lv_label_1_0= RULE_STRING )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1473:3: lv_label_1_0= RULE_STRING
                    {
                    lv_label_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextfield3064); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleTextfield3083); 

                	newLeafNode(otherlv_2, grammarAccess.getTextfieldAccess().getSummaryKeyword_1());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1493:1: ( (lv_summary_3_0= RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1494:1: (lv_summary_3_0= RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1494:1: (lv_summary_3_0= RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1495:3: lv_summary_3_0= RULE_STRING
            {
            lv_summary_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextfield3100); 

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

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1511:2: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1511:4: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleTextfield3118); 

                        	newLeafNode(otherlv_4, grammarAccess.getTextfieldAccess().getDescriptionKeyword_3_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1515:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1516:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1516:1: (lv_description_5_0= RULE_STRING )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1517:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextfield3135); 

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
    public static final BitSet FOLLOW_ruleActivity_in_ruleModel131 = new BitSet(new long[]{0x00000000004C6802L});
    public static final BitSet FOLLOW_ruleRole_in_ruleModel158 = new BitSet(new long[]{0x00000000004C6802L});
    public static final BitSet FOLLOW_ruleWorkProduct_in_ruleModel185 = new BitSet(new long[]{0x00000000004C6802L});
    public static final BitSet FOLLOW_ruleWorkProductType_in_ruleModel212 = new BitSet(new long[]{0x00000000004C6802L});
    public static final BitSet FOLLOW_ruleGuidance_in_ruleModel239 = new BitSet(new long[]{0x00000000004C6802L});
    public static final BitSet FOLLOW_ruleGuidanceType_in_ruleModel266 = new BitSet(new long[]{0x00000000004C6802L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleRole352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole369 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_ruleTextfield_in_ruleRole395 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRole407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkProductType_in_entryRuleWorkProductType443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkProductType453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleWorkProductType490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkProductType507 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_ruleTextfield_in_ruleWorkProductType533 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleWorkProductType545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkProduct_in_entryRuleWorkProduct581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkProduct591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleWorkProduct628 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkProduct645 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleWorkProduct662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkProduct682 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_ruleTextfield_in_ruleWorkProduct703 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_16_in_ruleWorkProduct716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleState_in_ruleWorkProduct737 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_17_in_ruleWorkProduct750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleState_in_ruleWorkProduct771 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_12_in_ruleWorkProduct787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidanceType_in_entryRuleGuidanceType823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuidanceType833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleGuidanceType870 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGuidanceType887 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_ruleTextfield_in_ruleGuidanceType913 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGuidanceType925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidance_in_entryRuleGuidance961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuidance971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleGuidance1008 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGuidance1025 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleGuidance1042 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGuidance1062 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_ruleTextfield_in_ruleGuidance1083 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGuidance1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState1131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort1222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePort1277 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_rulePort1290 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePort1310 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePort1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity1360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleActivity1407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity1424 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_ruleTextfield_in_ruleActivity1450 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleActivity1462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity1482 = new BitSet(new long[]{0x000000001F001000L});
    public static final BitSet FOLLOW_24_in_ruleActivity1495 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePort_in_ruleActivity1516 = new BitSet(new long[]{0x000000001E021000L});
    public static final BitSet FOLLOW_17_in_ruleActivity1529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePort_in_ruleActivity1550 = new BitSet(new long[]{0x000000001E021000L});
    public static final BitSet FOLLOW_25_in_ruleActivity1567 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePort_in_ruleActivity1588 = new BitSet(new long[]{0x000000001C021000L});
    public static final BitSet FOLLOW_17_in_ruleActivity1601 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePort_in_ruleActivity1622 = new BitSet(new long[]{0x000000001C021000L});
    public static final BitSet FOLLOW_26_in_ruleActivity1639 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleActivityRef_in_ruleActivity1660 = new BitSet(new long[]{0x0000000018021000L});
    public static final BitSet FOLLOW_17_in_ruleActivity1673 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleActivityRef_in_ruleActivity1694 = new BitSet(new long[]{0x0000000018021000L});
    public static final BitSet FOLLOW_27_in_ruleActivity1711 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity1731 = new BitSet(new long[]{0x0000000010021000L});
    public static final BitSet FOLLOW_17_in_ruleActivity1744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity1764 = new BitSet(new long[]{0x0000000010021000L});
    public static final BitSet FOLLOW_28_in_ruleActivity1781 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleActivity1793 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_ruleStep_in_ruleActivity1815 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_ruleDecision_in_ruleActivity1842 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleActivity1869 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_30_in_ruleActivity1883 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActivity1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityRef_in_entryRuleActivityRef1933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityRef1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivityRef1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecision_in_entryRuleDecision2024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecision2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDecision2071 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecision2088 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecision2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep2152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleStep2199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStep2216 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStep2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition2280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialTransition_in_ruleTransition2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFinalTransition_in_ruleTransition2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonInitialTransition_in_ruleTransition2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecisionTransition_in_ruleTransition2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialTransition_in_entryRuleInitialTransition2453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitialTransition2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleInitialTransition2500 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleInitialTransition2512 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleInitialTransition2524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInitialTransition2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFinalTransition_in_entryRuleFinalTransition2580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFinalTransition2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleFinalTransition2627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFinalTransition2647 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleFinalTransition2659 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleFinalTransition2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecisionTransition_in_entryRuleDecisionTransition2707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecisionTransition2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDecisionTransition2754 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecisionTransition2774 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleDecisionTransition2786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecisionTransition2806 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecisionTransition2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonInitialTransition_in_entryRuleNonInitialTransition2864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonInitialTransition2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleNonInitialTransition2911 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNonInitialTransition2931 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleNonInitialTransition2943 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNonInitialTransition2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_entryRuleTextfield2999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextfield3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTextfield3047 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextfield3064 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleTextfield3083 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextfield3100 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleTextfield3118 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextfield3135 = new BitSet(new long[]{0x0000000000000002L});

}