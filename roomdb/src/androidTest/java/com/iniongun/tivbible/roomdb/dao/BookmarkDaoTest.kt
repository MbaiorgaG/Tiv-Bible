package com.iniongun.tivbible.roomdb.dao

/**
 * Created by Isaac Iniongun on 2019-12-13.
 * For Tiv Bible project.
 */

//@RunWith(AndroidJUnit4::class)
//class BookmarkDaoTest {
//
//    @get:Rule
//    val instantTaskExecutorRule = InstantTaskExecutorRule()
//
//    private lateinit var mTivBibleDatabase: TivBibleDatabase
//
//    private lateinit var bookmarkDao: BookmarkDao
//
//    private val testVerse = Verse("123", 1, "Ter ngurumun mo", false, "")
//    private val testBookmark = Bookmark(OffsetDateTime.now(), testVerse)
//
//    @Before
//    internal fun setUp() {
//
//        mTivBibleDatabase = Room.inMemoryDatabaseBuilder(getApplicationContext(), TivBibleDatabase::class.java)
//            .allowMainThreadQueries()
//            .build()
//
//        bookmarkDao = mTivBibleDatabase.bookmarkDao()
//
//    }
//
//    @After
//    internal fun tearDown() {
//        mTivBibleDatabase.close()
//    }
//
//    @Test
//    internal fun getAllBookmarks_shouldReturnNoValues_whenNoValuesInserted() {
//        val bookmarks = bookmarkDao.getBookmarks().blockingFirst()
//
//        assertTrue(bookmarks.isNullOrEmpty())
//    }
//
//    @Test
//    internal fun getAllBookmarks_shouldReturnValues_whenValuesInserted() {
//
//        bookmarkDao.insertBookmarks(testBookmark).blockingAwait()
//
//        val bookmarks = bookmarkDao.getBookmarks().blockingFirst()
//
//        assertNotNull(bookmarks)
//        assertEquals(bookmarks[0].bookmarkedOn, testBookmark.bookmarkedOn)
//        assertEquals(bookmarks[0].id, testBookmark.id)
//        assertEquals(bookmarks[0].verse.number, testBookmark.verse.id)
//        assertEquals(bookmarks[0].verse.chapterId, testBookmark.verse.chapterId)
//        assertEquals(bookmarks[0].verse.text, testBookmark.verse.text)
//        assertEquals(bookmarks[0].verse.hasTitle, testBookmark.verse.hasTitle)
//        assertEquals(bookmarks[0].verse.title, testBookmark.verse.title)
//
//    }
//
//}