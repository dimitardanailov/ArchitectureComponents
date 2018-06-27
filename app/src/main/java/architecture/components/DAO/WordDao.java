package architecture.components.DAO;

import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import architecture.components.entities.Word;

public interface WordDao {

    @Query("SELECT * from word_table ORDER BY word ASC")
    List<Word> getAllWords();

    @Insert
    void insert(Word word);

    @Query("DELETE FROM word_table")
    void deleteAll();


}
