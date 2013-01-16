/* Copyright (c) 2001-2008, The HSQL Development Group
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * Neither the name of the HSQL Development Group nor the names of its
 * contributors may be used to endorse or promote products derived from this
 * software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL HSQL DEVELOPMENT GROUP, HSQLDB.ORG,
 * OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */


package org.hsqldb1.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AllTests extends TestCase {

    public AllTests(String s) {
        super(s);
    }

    public static Test suite() {

        TestSuite suite = new TestSuite();

        suite.addTestSuite(org.hsqldb1.test.TestBatchExecution.class);
        // suite.addTestSuite(org.hsqldb.test.TestBug1191815.class);//
        suite.addTestSuite(org.hsqldb1.test.TestBug778213.class);
        suite.addTestSuite(org.hsqldb1.test.TestBug785429.class);
        suite.addTestSuite(org.hsqldb1.test.TestBug808460.class);
        suite.addTestSuite(org.hsqldb1.test.TestCollation.class);//
        suite.addTestSuite(org.hsqldb1.test.TestDatabaseMetaData.class);
        suite.addTestSuite(org.hsqldb1.test.TestDateTime.class);
        suite.addTestSuite(org.hsqldb1.test.TestINPredicateParameterizationAndCorrelation.class);//
//        suite.addTestSuite(org.hsqldb.test.TestJDBCGeneratedColumns.class);//
        suite.addTestSuite(org.hsqldb1.test.TestJDBCSavepoints.class);
        suite.addTestSuite(org.hsqldb1.test.TestLikePredicateOptimizations.class);
//        suite.addTestSuite(org.hsqldb.test.TestLobs.class);
//        suite.addTestSuite(org.hsqldb.test.TestMerge.class);
//        suite.addTestSuite(org.hsqldb.test.TestMultiInsert.class);
        suite.addTestSuite(org.hsqldb1.test.TestSql.class);
        suite.addTestSuite(org.hsqldb1.test.TestStoredProcedure.class);
        suite.addTestSuite(org.hsqldb1.test.TestSubselect.class);
        suite.addTestSuite(org.hsqldb1.test.TestTextTable.class);
        suite.addTestSuite(org.hsqldb1.test.TestTextTables.class);
        suite.addTestSuite(org.hsqldb1.test.TestTimestamp.class);
        suite.addTestSuite(org.hsqldb1.test.TestViewAsterisks.class);

        //
        suite.addTestSuite(org.hsqldb1.test.TestCascade.class);
//        suite.addTestSuite(org.hsqldb.test.TestDataStructures.class);
        suite.addTestSuite(org.hsqldb1.test.TestGroupByHaving.class);
        suite.addTestSuite(org.hsqldb1.test.TestSqlPersistent.class);
        return suite;
    }
}
