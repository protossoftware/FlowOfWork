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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Role'", "';'", "'WorkProductType'", "'WorkProduct'", "':'", "'states'", "','", "'GuidanceType'", "'Guidance'", "'('", "')'", "'Activity'", "'responsible'", "'inputs'", "'outputs'", "'subActivities'", "'guidances'", "'Behavior'", "'{'", "'}'", "'Decision'", "'Step'", "'Transition'", "'initial'", "'to'", "'final'", "'label'", "'summary'", "'description'", "'link'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:533:1: ruleGuidance returns [EObject current=null] : (otherlv_0= 'Guidance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) ( (lv_links_5_0= ruleLink ) )* otherlv_6= ';' ) ;
    public final EObject ruleGuidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_textfield_4_0 = null;

        EObject lv_links_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:536:28: ( (otherlv_0= 'Guidance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) ( (lv_links_5_0= ruleLink ) )* otherlv_6= ';' ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:537:1: (otherlv_0= 'Guidance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) ( (lv_links_5_0= ruleLink ) )* otherlv_6= ';' )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:537:1: (otherlv_0= 'Guidance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) ( (lv_links_5_0= ruleLink ) )* otherlv_6= ';' )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:537:3: otherlv_0= 'Guidance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_textfield_4_0= ruleTextfield ) ) ( (lv_links_5_0= ruleLink ) )* otherlv_6= ';'
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

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:594:2: ( (lv_links_5_0= ruleLink ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==40) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:595:1: (lv_links_5_0= ruleLink )
            	    {
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:595:1: (lv_links_5_0= ruleLink )
            	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:596:3: lv_links_5_0= ruleLink
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGuidanceAccess().getLinksLinkParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLink_in_ruleGuidance1104);
            	    lv_links_5_0=ruleLink();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGuidanceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"links",
            	            		lv_links_5_0, 
            	            		"Link");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleGuidance1117); 

                	newLeafNode(otherlv_6, grammarAccess.getGuidanceAccess().getSemicolonKeyword_6());
                

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:624:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:625:2: (iv_ruleState= ruleState EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:626:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState1153);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState1163); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:633:1: ruleState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:636:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:637:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:637:1: ( (lv_name_0_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:638:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:638:1: (lv_name_0_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:639:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState1204); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:663:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:664:2: (iv_rulePort= rulePort EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:665:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort1244);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort1254); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:672:1: rulePort returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )? ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:675:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )? ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:676:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )? )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:676:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )? )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:676:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )?
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:676:2: ( (otherlv_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:677:1: (otherlv_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:677:1: (otherlv_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:678:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPortRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePort1299); 

            		newLeafNode(otherlv_0, grammarAccess.getPortAccess().getTypeWorkProductCrossReference_0_0()); 
            	

            }


            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:689:2: (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:689:4: otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_rulePort1312); 

                        	newLeafNode(otherlv_1, grammarAccess.getPortAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:693:1: ( (otherlv_2= RULE_ID ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:694:1: (otherlv_2= RULE_ID )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:694:1: (otherlv_2= RULE_ID )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:695:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPortRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePort1332); 

                    		newLeafNode(otherlv_2, grammarAccess.getPortAccess().getStateStateCrossReference_1_1_0()); 
                    	

                    }


                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_rulePort1344); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:718:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:719:2: (iv_ruleActivity= ruleActivity EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:720:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity1382);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity1392); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:727:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= 'responsible' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )* )? (otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )* )? (otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )* )? (otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? (otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}' )? otherlv_27= ';' ) ;
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
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:730:28: ( (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= 'responsible' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )* )? (otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )* )? (otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )* )? (otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? (otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}' )? otherlv_27= ';' ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:731:1: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= 'responsible' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )* )? (otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )* )? (otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )* )? (otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? (otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}' )? otherlv_27= ';' )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:731:1: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= 'responsible' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )* )? (otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )* )? (otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )* )? (otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? (otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}' )? otherlv_27= ';' )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:731:3: otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_textfield_2_0= ruleTextfield ) ) otherlv_3= 'responsible' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )* )? (otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )* )? (otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )* )? (otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )? (otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}' )? otherlv_27= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleActivity1429); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:735:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:736:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:736:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:737:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity1446); 

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

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:753:2: ( (lv_textfield_2_0= ruleTextfield ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:754:1: (lv_textfield_2_0= ruleTextfield )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:754:1: (lv_textfield_2_0= ruleTextfield )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:755:3: lv_textfield_2_0= ruleTextfield
            {
             
            	        newCompositeNode(grammarAccess.getActivityAccess().getTextfieldTextfieldParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTextfield_in_ruleActivity1472);
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

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleActivity1484); 

                	newLeafNode(otherlv_3, grammarAccess.getActivityAccess().getResponsibleKeyword_3());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:775:1: ( (otherlv_4= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:776:1: (otherlv_4= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:776:1: (otherlv_4= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:777:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity1504); 

            		newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getRoleRoleCrossReference_4_0()); 
            	

            }


            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:788:2: (otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:788:4: otherlv_5= 'inputs' ( (lv_inPorts_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )*
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleActivity1517); 

                        	newLeafNode(otherlv_5, grammarAccess.getActivityAccess().getInputsKeyword_5_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:792:1: ( (lv_inPorts_6_0= rulePort ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:793:1: (lv_inPorts_6_0= rulePort )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:793:1: (lv_inPorts_6_0= rulePort )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:794:3: lv_inPorts_6_0= rulePort
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getInPortsPortParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePort_in_ruleActivity1538);
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

                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:810:2: (otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==17) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:810:4: otherlv_7= ',' ( (lv_inPorts_8_0= rulePort ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleActivity1551); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getActivityAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:814:1: ( (lv_inPorts_8_0= rulePort ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:815:1: (lv_inPorts_8_0= rulePort )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:815:1: (lv_inPorts_8_0= rulePort )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:816:3: lv_inPorts_8_0= rulePort
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getInPortsPortParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePort_in_ruleActivity1572);
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
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:832:6: (otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:832:8: otherlv_9= 'outputs' ( (lv_outPorts_10_0= rulePort ) ) (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )*
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_25_in_ruleActivity1589); 

                        	newLeafNode(otherlv_9, grammarAccess.getActivityAccess().getOutputsKeyword_6_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:836:1: ( (lv_outPorts_10_0= rulePort ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:837:1: (lv_outPorts_10_0= rulePort )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:837:1: (lv_outPorts_10_0= rulePort )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:838:3: lv_outPorts_10_0= rulePort
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getOutPortsPortParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePort_in_ruleActivity1610);
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

                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:854:2: (otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==17) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:854:4: otherlv_11= ',' ( (lv_outPorts_12_0= rulePort ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleActivity1623); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getActivityAccess().getCommaKeyword_6_2_0());
                    	        
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:858:1: ( (lv_outPorts_12_0= rulePort ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:859:1: (lv_outPorts_12_0= rulePort )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:859:1: (lv_outPorts_12_0= rulePort )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:860:3: lv_outPorts_12_0= rulePort
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getOutPortsPortParserRuleCall_6_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePort_in_ruleActivity1644);
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
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:876:6: (otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:876:8: otherlv_13= 'subActivities' ( (lv_subActivities_14_0= ruleActivityRef ) ) (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )*
                    {
                    otherlv_13=(Token)match(input,26,FOLLOW_26_in_ruleActivity1661); 

                        	newLeafNode(otherlv_13, grammarAccess.getActivityAccess().getSubActivitiesKeyword_7_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:880:1: ( (lv_subActivities_14_0= ruleActivityRef ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:881:1: (lv_subActivities_14_0= ruleActivityRef )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:881:1: (lv_subActivities_14_0= ruleActivityRef )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:882:3: lv_subActivities_14_0= ruleActivityRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getSubActivitiesActivityRefParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActivityRef_in_ruleActivity1682);
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

                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:898:2: (otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==17) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:898:4: otherlv_15= ',' ( (lv_subActivities_16_0= ruleActivityRef ) )
                    	    {
                    	    otherlv_15=(Token)match(input,17,FOLLOW_17_in_ruleActivity1695); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getActivityAccess().getCommaKeyword_7_2_0());
                    	        
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:902:1: ( (lv_subActivities_16_0= ruleActivityRef ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:903:1: (lv_subActivities_16_0= ruleActivityRef )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:903:1: (lv_subActivities_16_0= ruleActivityRef )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:904:3: lv_subActivities_16_0= ruleActivityRef
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getSubActivitiesActivityRefParserRuleCall_7_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleActivityRef_in_ruleActivity1716);
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
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:920:6: (otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:920:8: otherlv_17= 'guidances' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )*
                    {
                    otherlv_17=(Token)match(input,27,FOLLOW_27_in_ruleActivity1733); 

                        	newLeafNode(otherlv_17, grammarAccess.getActivityAccess().getGuidancesKeyword_8_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:924:1: ( (otherlv_18= RULE_ID ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:925:1: (otherlv_18= RULE_ID )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:925:1: (otherlv_18= RULE_ID )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:926:3: otherlv_18= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                            
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity1753); 

                    		newLeafNode(otherlv_18, grammarAccess.getActivityAccess().getGuidancesGuidanceCrossReference_8_1_0()); 
                    	

                    }


                    }

                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:937:2: (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==17) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:937:4: otherlv_19= ',' ( (otherlv_20= RULE_ID ) )
                    	    {
                    	    otherlv_19=(Token)match(input,17,FOLLOW_17_in_ruleActivity1766); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getActivityAccess().getCommaKeyword_8_2_0());
                    	        
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:941:1: ( (otherlv_20= RULE_ID ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:942:1: (otherlv_20= RULE_ID )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:942:1: (otherlv_20= RULE_ID )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:943:3: otherlv_20= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActivityRule());
                    	    	        }
                    	            
                    	    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity1786); 

                    	    		newLeafNode(otherlv_20, grammarAccess.getActivityAccess().getGuidancesGuidanceCrossReference_8_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:954:6: (otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:954:8: otherlv_21= 'Behavior' otherlv_22= '{' ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,28,FOLLOW_28_in_ruleActivity1803); 

                        	newLeafNode(otherlv_21, grammarAccess.getActivityAccess().getBehaviorKeyword_9_0());
                        
                    otherlv_22=(Token)match(input,29,FOLLOW_29_in_ruleActivity1815); 

                        	newLeafNode(otherlv_22, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:962:1: ( ( (lv_steps_23_0= ruleStep ) ) | ( (lv_decisions_24_0= ruleDecision ) ) | ( (lv_transitions_25_0= ruleTransition ) ) )*
                    loop14:
                    do {
                        int alt14=4;
                        switch ( input.LA(1) ) {
                        case 32:
                            {
                            alt14=1;
                            }
                            break;
                        case 31:
                            {
                            alt14=2;
                            }
                            break;
                        case 33:
                            {
                            alt14=3;
                            }
                            break;

                        }

                        switch (alt14) {
                    	case 1 :
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:962:2: ( (lv_steps_23_0= ruleStep ) )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:962:2: ( (lv_steps_23_0= ruleStep ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:963:1: (lv_steps_23_0= ruleStep )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:963:1: (lv_steps_23_0= ruleStep )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:964:3: lv_steps_23_0= ruleStep
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getStepsStepParserRuleCall_9_2_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStep_in_ruleActivity1837);
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
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:981:6: ( (lv_decisions_24_0= ruleDecision ) )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:981:6: ( (lv_decisions_24_0= ruleDecision ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:982:1: (lv_decisions_24_0= ruleDecision )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:982:1: (lv_decisions_24_0= ruleDecision )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:983:3: lv_decisions_24_0= ruleDecision
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getDecisionsDecisionParserRuleCall_9_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDecision_in_ruleActivity1864);
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
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1000:6: ( (lv_transitions_25_0= ruleTransition ) )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1000:6: ( (lv_transitions_25_0= ruleTransition ) )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1001:1: (lv_transitions_25_0= ruleTransition )
                    	    {
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1001:1: (lv_transitions_25_0= ruleTransition )
                    	    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1002:3: lv_transitions_25_0= ruleTransition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getTransitionsTransitionParserRuleCall_9_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTransition_in_ruleActivity1891);
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
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,30,FOLLOW_30_in_ruleActivity1905); 

                        	newLeafNode(otherlv_26, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_9_3());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,12,FOLLOW_12_in_ruleActivity1919); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1034:1: entryRuleActivityRef returns [EObject current=null] : iv_ruleActivityRef= ruleActivityRef EOF ;
    public final EObject entryRuleActivityRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityRef = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1035:2: (iv_ruleActivityRef= ruleActivityRef EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1036:2: iv_ruleActivityRef= ruleActivityRef EOF
            {
             newCompositeNode(grammarAccess.getActivityRefRule()); 
            pushFollow(FOLLOW_ruleActivityRef_in_entryRuleActivityRef1955);
            iv_ruleActivityRef=ruleActivityRef();

            state._fsp--;

             current =iv_ruleActivityRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityRef1965); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1043:1: ruleActivityRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleActivityRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1046:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1047:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1047:1: ( (otherlv_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1048:1: (otherlv_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1048:1: (otherlv_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1049:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivityRef2009); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1070:1: entryRuleDecision returns [EObject current=null] : iv_ruleDecision= ruleDecision EOF ;
    public final EObject entryRuleDecision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecision = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1071:2: (iv_ruleDecision= ruleDecision EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1072:2: iv_ruleDecision= ruleDecision EOF
            {
             newCompositeNode(grammarAccess.getDecisionRule()); 
            pushFollow(FOLLOW_ruleDecision_in_entryRuleDecision2046);
            iv_ruleDecision=ruleDecision();

            state._fsp--;

             current =iv_ruleDecision; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecision2056); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1079:1: ruleDecision returns [EObject current=null] : (otherlv_0= 'Decision' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleDecision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_label_2_0=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1082:28: ( (otherlv_0= 'Decision' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1083:1: (otherlv_0= 'Decision' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1083:1: (otherlv_0= 'Decision' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1083:3: otherlv_0= 'Decision' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleDecision2093); 

                	newLeafNode(otherlv_0, grammarAccess.getDecisionAccess().getDecisionKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1087:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1088:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1088:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1089:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecision2110); 

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

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1105:2: ( (lv_label_2_0= RULE_STRING ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1106:1: (lv_label_2_0= RULE_STRING )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1106:1: (lv_label_2_0= RULE_STRING )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1107:3: lv_label_2_0= RULE_STRING
                    {
                    lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecision2132); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1131:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1132:2: (iv_ruleStep= ruleStep EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1133:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep2174);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep2184); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1140:1: ruleStep returns [EObject current=null] : (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_label_2_0=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1143:28: ( (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1144:1: (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1144:1: (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1144:3: otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleStep2221); 

                	newLeafNode(otherlv_0, grammarAccess.getStepAccess().getStepKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1148:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1149:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1149:1: (lv_name_1_0= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1150:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStep2238); 

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

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1166:2: ( (lv_label_2_0= RULE_STRING ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1167:1: (lv_label_2_0= RULE_STRING )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1167:1: (lv_label_2_0= RULE_STRING )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1168:3: lv_label_2_0= RULE_STRING
                    {
                    lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStep2260); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1192:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1193:2: (iv_ruleTransition= ruleTransition EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1194:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition2302);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition2312); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1201:1: ruleTransition returns [EObject current=null] : (this_InitialTransition_0= ruleInitialTransition | this_FinalTransition_1= ruleFinalTransition | this_NonInitialTransition_2= ruleNonInitialTransition | this_DecisionTransition_3= ruleDecisionTransition ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        EObject this_InitialTransition_0 = null;

        EObject this_FinalTransition_1 = null;

        EObject this_NonInitialTransition_2 = null;

        EObject this_DecisionTransition_3 = null;


         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1204:28: ( (this_InitialTransition_0= ruleInitialTransition | this_FinalTransition_1= ruleFinalTransition | this_NonInitialTransition_2= ruleNonInitialTransition | this_DecisionTransition_3= ruleDecisionTransition ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1205:1: (this_InitialTransition_0= ruleInitialTransition | this_FinalTransition_1= ruleFinalTransition | this_NonInitialTransition_2= ruleNonInitialTransition | this_DecisionTransition_3= ruleDecisionTransition )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1205:1: (this_InitialTransition_0= ruleInitialTransition | this_FinalTransition_1= ruleFinalTransition | this_NonInitialTransition_2= ruleNonInitialTransition | this_DecisionTransition_3= ruleDecisionTransition )
            int alt18=4;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==RULE_ID) ) {
                    int LA18_2 = input.LA(3);

                    if ( (LA18_2==35) ) {
                        int LA18_4 = input.LA(4);

                        if ( (LA18_4==36) ) {
                            alt18=2;
                        }
                        else if ( (LA18_4==RULE_ID) ) {
                            int LA18_6 = input.LA(5);

                            if ( (LA18_6==EOF||(LA18_6>=30 && LA18_6<=33)) ) {
                                alt18=3;
                            }
                            else if ( (LA18_6==RULE_STRING) ) {
                                alt18=4;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 18, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA18_1==34) ) {
                    alt18=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1206:5: this_InitialTransition_0= ruleInitialTransition
                    {
                     
                            newCompositeNode(grammarAccess.getTransitionAccess().getInitialTransitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInitialTransition_in_ruleTransition2359);
                    this_InitialTransition_0=ruleInitialTransition();

                    state._fsp--;

                     
                            current = this_InitialTransition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1216:5: this_FinalTransition_1= ruleFinalTransition
                    {
                     
                            newCompositeNode(grammarAccess.getTransitionAccess().getFinalTransitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFinalTransition_in_ruleTransition2386);
                    this_FinalTransition_1=ruleFinalTransition();

                    state._fsp--;

                     
                            current = this_FinalTransition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1226:5: this_NonInitialTransition_2= ruleNonInitialTransition
                    {
                     
                            newCompositeNode(grammarAccess.getTransitionAccess().getNonInitialTransitionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNonInitialTransition_in_ruleTransition2413);
                    this_NonInitialTransition_2=ruleNonInitialTransition();

                    state._fsp--;

                     
                            current = this_NonInitialTransition_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1236:5: this_DecisionTransition_3= ruleDecisionTransition
                    {
                     
                            newCompositeNode(grammarAccess.getTransitionAccess().getDecisionTransitionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDecisionTransition_in_ruleTransition2440);
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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1252:1: entryRuleInitialTransition returns [EObject current=null] : iv_ruleInitialTransition= ruleInitialTransition EOF ;
    public final EObject entryRuleInitialTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialTransition = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1253:2: (iv_ruleInitialTransition= ruleInitialTransition EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1254:2: iv_ruleInitialTransition= ruleInitialTransition EOF
            {
             newCompositeNode(grammarAccess.getInitialTransitionRule()); 
            pushFollow(FOLLOW_ruleInitialTransition_in_entryRuleInitialTransition2475);
            iv_ruleInitialTransition=ruleInitialTransition();

            state._fsp--;

             current =iv_ruleInitialTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitialTransition2485); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1261:1: ruleInitialTransition returns [EObject current=null] : (otherlv_0= 'Transition' otherlv_1= 'initial' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleInitialTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1264:28: ( (otherlv_0= 'Transition' otherlv_1= 'initial' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1265:1: (otherlv_0= 'Transition' otherlv_1= 'initial' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1265:1: (otherlv_0= 'Transition' otherlv_1= 'initial' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1265:3: otherlv_0= 'Transition' otherlv_1= 'initial' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleInitialTransition2522); 

                	newLeafNode(otherlv_0, grammarAccess.getInitialTransitionAccess().getTransitionKeyword_0());
                
            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleInitialTransition2534); 

                	newLeafNode(otherlv_1, grammarAccess.getInitialTransitionAccess().getInitialKeyword_1());
                
            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleInitialTransition2546); 

                	newLeafNode(otherlv_2, grammarAccess.getInitialTransitionAccess().getToKeyword_2());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1277:1: ( (otherlv_3= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1278:1: (otherlv_3= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1278:1: (otherlv_3= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1279:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInitialTransitionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInitialTransition2566); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1298:1: entryRuleFinalTransition returns [EObject current=null] : iv_ruleFinalTransition= ruleFinalTransition EOF ;
    public final EObject entryRuleFinalTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinalTransition = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1299:2: (iv_ruleFinalTransition= ruleFinalTransition EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1300:2: iv_ruleFinalTransition= ruleFinalTransition EOF
            {
             newCompositeNode(grammarAccess.getFinalTransitionRule()); 
            pushFollow(FOLLOW_ruleFinalTransition_in_entryRuleFinalTransition2602);
            iv_ruleFinalTransition=ruleFinalTransition();

            state._fsp--;

             current =iv_ruleFinalTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFinalTransition2612); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1307:1: ruleFinalTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' otherlv_3= 'final' ) ;
    public final EObject ruleFinalTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1310:28: ( (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' otherlv_3= 'final' ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1311:1: (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' otherlv_3= 'final' )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1311:1: (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' otherlv_3= 'final' )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1311:3: otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' otherlv_3= 'final'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleFinalTransition2649); 

                	newLeafNode(otherlv_0, grammarAccess.getFinalTransitionAccess().getTransitionKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1315:1: ( (otherlv_1= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1316:1: (otherlv_1= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1316:1: (otherlv_1= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1317:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFinalTransitionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFinalTransition2669); 

            		newLeafNode(otherlv_1, grammarAccess.getFinalTransitionAccess().getFromNodeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleFinalTransition2681); 

                	newLeafNode(otherlv_2, grammarAccess.getFinalTransitionAccess().getToKeyword_2());
                
            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleFinalTransition2693); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1344:1: entryRuleDecisionTransition returns [EObject current=null] : iv_ruleDecisionTransition= ruleDecisionTransition EOF ;
    public final EObject entryRuleDecisionTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecisionTransition = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1345:2: (iv_ruleDecisionTransition= ruleDecisionTransition EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1346:2: iv_ruleDecisionTransition= ruleDecisionTransition EOF
            {
             newCompositeNode(grammarAccess.getDecisionTransitionRule()); 
            pushFollow(FOLLOW_ruleDecisionTransition_in_entryRuleDecisionTransition2729);
            iv_ruleDecisionTransition=ruleDecisionTransition();

            state._fsp--;

             current =iv_ruleDecisionTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecisionTransition2739); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1353:1: ruleDecisionTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ( (lv_guard_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleDecisionTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_guard_4_0=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1356:28: ( (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ( (lv_guard_4_0= RULE_STRING ) ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1357:1: (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ( (lv_guard_4_0= RULE_STRING ) ) )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1357:1: (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ( (lv_guard_4_0= RULE_STRING ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1357:3: otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ( (lv_guard_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleDecisionTransition2776); 

                	newLeafNode(otherlv_0, grammarAccess.getDecisionTransitionAccess().getTransitionKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1361:1: ( (otherlv_1= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1362:1: (otherlv_1= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1362:1: (otherlv_1= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1363:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDecisionTransitionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecisionTransition2796); 

            		newLeafNode(otherlv_1, grammarAccess.getDecisionTransitionAccess().getFromDecisionCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleDecisionTransition2808); 

                	newLeafNode(otherlv_2, grammarAccess.getDecisionTransitionAccess().getToKeyword_2());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1378:1: ( (otherlv_3= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1379:1: (otherlv_3= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1379:1: (otherlv_3= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1380:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDecisionTransitionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecisionTransition2828); 

            		newLeafNode(otherlv_3, grammarAccess.getDecisionTransitionAccess().getToNodeCrossReference_3_0()); 
            	

            }


            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1391:2: ( (lv_guard_4_0= RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1392:1: (lv_guard_4_0= RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1392:1: (lv_guard_4_0= RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1393:3: lv_guard_4_0= RULE_STRING
            {
            lv_guard_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecisionTransition2845); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1417:1: entryRuleNonInitialTransition returns [EObject current=null] : iv_ruleNonInitialTransition= ruleNonInitialTransition EOF ;
    public final EObject entryRuleNonInitialTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonInitialTransition = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1418:2: (iv_ruleNonInitialTransition= ruleNonInitialTransition EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1419:2: iv_ruleNonInitialTransition= ruleNonInitialTransition EOF
            {
             newCompositeNode(grammarAccess.getNonInitialTransitionRule()); 
            pushFollow(FOLLOW_ruleNonInitialTransition_in_entryRuleNonInitialTransition2886);
            iv_ruleNonInitialTransition=ruleNonInitialTransition();

            state._fsp--;

             current =iv_ruleNonInitialTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonInitialTransition2896); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1426:1: ruleNonInitialTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleNonInitialTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1429:28: ( (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1430:1: (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1430:1: (otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1430:3: otherlv_0= 'Transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleNonInitialTransition2933); 

                	newLeafNode(otherlv_0, grammarAccess.getNonInitialTransitionAccess().getTransitionKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1434:1: ( (otherlv_1= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1435:1: (otherlv_1= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1435:1: (otherlv_1= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1436:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNonInitialTransitionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNonInitialTransition2953); 

            		newLeafNode(otherlv_1, grammarAccess.getNonInitialTransitionAccess().getFromNodeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleNonInitialTransition2965); 

                	newLeafNode(otherlv_2, grammarAccess.getNonInitialTransitionAccess().getToKeyword_2());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1451:1: ( (otherlv_3= RULE_ID ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1452:1: (otherlv_3= RULE_ID )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1452:1: (otherlv_3= RULE_ID )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1453:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNonInitialTransitionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNonInitialTransition2985); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1472:1: entryRuleTextfield returns [EObject current=null] : iv_ruleTextfield= ruleTextfield EOF ;
    public final EObject entryRuleTextfield() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextfield = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1473:2: (iv_ruleTextfield= ruleTextfield EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1474:2: iv_ruleTextfield= ruleTextfield EOF
            {
             newCompositeNode(grammarAccess.getTextfieldRule()); 
            pushFollow(FOLLOW_ruleTextfield_in_entryRuleTextfield3021);
            iv_ruleTextfield=ruleTextfield();

            state._fsp--;

             current =iv_ruleTextfield; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextfield3031); 

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
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1481:1: ruleTextfield returns [EObject current=null] : ( (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) )? otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? ) ;
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
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1484:28: ( ( (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) )? otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1485:1: ( (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) )? otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1485:1: ( (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) )? otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1485:2: (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) )? otherlv_2= 'summary' ( (lv_summary_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1485:2: (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1485:4: otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleTextfield3069); 

                        	newLeafNode(otherlv_0, grammarAccess.getTextfieldAccess().getLabelKeyword_0_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1489:1: ( (lv_label_1_0= RULE_STRING ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1490:1: (lv_label_1_0= RULE_STRING )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1490:1: (lv_label_1_0= RULE_STRING )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1491:3: lv_label_1_0= RULE_STRING
                    {
                    lv_label_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextfield3086); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleTextfield3105); 

                	newLeafNode(otherlv_2, grammarAccess.getTextfieldAccess().getSummaryKeyword_1());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1511:1: ( (lv_summary_3_0= RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1512:1: (lv_summary_3_0= RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1512:1: (lv_summary_3_0= RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1513:3: lv_summary_3_0= RULE_STRING
            {
            lv_summary_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextfield3122); 

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

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1529:2: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1529:4: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleTextfield3140); 

                        	newLeafNode(otherlv_4, grammarAccess.getTextfieldAccess().getDescriptionKeyword_3_0());
                        
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1533:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1534:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1534:1: (lv_description_5_0= RULE_STRING )
                    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1535:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextfield3157); 

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


    // $ANTLR start "entryRuleLink"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1559:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1560:2: (iv_ruleLink= ruleLink EOF )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1561:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink3200);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink3210); 

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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1568:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link' ( (lv_description_1_0= RULE_STRING ) ) ( (lv_url_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;
        Token lv_url_2_0=null;

         enterRule(); 
            
        try {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1571:28: ( (otherlv_0= 'link' ( (lv_description_1_0= RULE_STRING ) ) ( (lv_url_2_0= RULE_STRING ) ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1572:1: (otherlv_0= 'link' ( (lv_description_1_0= RULE_STRING ) ) ( (lv_url_2_0= RULE_STRING ) ) )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1572:1: (otherlv_0= 'link' ( (lv_description_1_0= RULE_STRING ) ) ( (lv_url_2_0= RULE_STRING ) ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1572:3: otherlv_0= 'link' ( (lv_description_1_0= RULE_STRING ) ) ( (lv_url_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleLink3247); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
                
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1576:1: ( (lv_description_1_0= RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1577:1: (lv_description_1_0= RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1577:1: (lv_description_1_0= RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1578:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLink3264); 

            			newLeafNode(lv_description_1_0, grammarAccess.getLinkAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1594:2: ( (lv_url_2_0= RULE_STRING ) )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1595:1: (lv_url_2_0= RULE_STRING )
            {
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1595:1: (lv_url_2_0= RULE_STRING )
            // ../de.protos.FlowOfWork.core.fow/src-gen/de/protos/FlowOfWork/core/fow/parser/antlr/internal/InternalFoW.g:1596:3: lv_url_2_0= RULE_STRING
            {
            lv_url_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLink3286); 

            			newLeafNode(lv_url_2_0, grammarAccess.getLinkAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"url",
                    		lv_url_2_0, 
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
    // $ANTLR end "ruleLink"

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
    public static final BitSet FOLLOW_ruleTextfield_in_ruleGuidance1083 = new BitSet(new long[]{0x0000010000001000L});
    public static final BitSet FOLLOW_ruleLink_in_ruleGuidance1104 = new BitSet(new long[]{0x0000010000001000L});
    public static final BitSet FOLLOW_12_in_ruleGuidance1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState1153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort1244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePort1299 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_rulePort1312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePort1332 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePort1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleActivity1429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity1446 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_ruleTextfield_in_ruleActivity1472 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleActivity1484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity1504 = new BitSet(new long[]{0x000000001F001000L});
    public static final BitSet FOLLOW_24_in_ruleActivity1517 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePort_in_ruleActivity1538 = new BitSet(new long[]{0x000000001E021000L});
    public static final BitSet FOLLOW_17_in_ruleActivity1551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePort_in_ruleActivity1572 = new BitSet(new long[]{0x000000001E021000L});
    public static final BitSet FOLLOW_25_in_ruleActivity1589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePort_in_ruleActivity1610 = new BitSet(new long[]{0x000000001C021000L});
    public static final BitSet FOLLOW_17_in_ruleActivity1623 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePort_in_ruleActivity1644 = new BitSet(new long[]{0x000000001C021000L});
    public static final BitSet FOLLOW_26_in_ruleActivity1661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleActivityRef_in_ruleActivity1682 = new BitSet(new long[]{0x0000000018021000L});
    public static final BitSet FOLLOW_17_in_ruleActivity1695 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleActivityRef_in_ruleActivity1716 = new BitSet(new long[]{0x0000000018021000L});
    public static final BitSet FOLLOW_27_in_ruleActivity1733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity1753 = new BitSet(new long[]{0x0000000010021000L});
    public static final BitSet FOLLOW_17_in_ruleActivity1766 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity1786 = new BitSet(new long[]{0x0000000010021000L});
    public static final BitSet FOLLOW_28_in_ruleActivity1803 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleActivity1815 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_ruleStep_in_ruleActivity1837 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_ruleDecision_in_ruleActivity1864 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleActivity1891 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_30_in_ruleActivity1905 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActivity1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityRef_in_entryRuleActivityRef1955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityRef1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivityRef2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecision_in_entryRuleDecision2046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecision2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDecision2093 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecision2110 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecision2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep2174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleStep2221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStep2238 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStep2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition2302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialTransition_in_ruleTransition2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFinalTransition_in_ruleTransition2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonInitialTransition_in_ruleTransition2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecisionTransition_in_ruleTransition2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialTransition_in_entryRuleInitialTransition2475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitialTransition2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleInitialTransition2522 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleInitialTransition2534 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleInitialTransition2546 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInitialTransition2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFinalTransition_in_entryRuleFinalTransition2602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFinalTransition2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleFinalTransition2649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFinalTransition2669 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleFinalTransition2681 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleFinalTransition2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecisionTransition_in_entryRuleDecisionTransition2729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecisionTransition2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDecisionTransition2776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecisionTransition2796 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleDecisionTransition2808 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecisionTransition2828 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecisionTransition2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonInitialTransition_in_entryRuleNonInitialTransition2886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonInitialTransition2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleNonInitialTransition2933 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNonInitialTransition2953 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleNonInitialTransition2965 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNonInitialTransition2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextfield_in_entryRuleTextfield3021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextfield3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTextfield3069 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextfield3086 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleTextfield3105 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextfield3122 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleTextfield3140 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextfield3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink3200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleLink3247 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLink3264 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLink3286 = new BitSet(new long[]{0x0000000000000002L});

}