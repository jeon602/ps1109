package com.example.ps1109.Mapper;

        import com.example.ps1109.Domain.Board;
        import org.apache.ibatis.annotations.Delete;
        import org.apache.ibatis.annotations.Insert;
        import org.apache.ibatis.annotations.Mapper;
        import org.apache.ibatis.annotations.Select;

        import java.util.List;

@Mapper
public interface MP{

    @Insert("""
        INSERT INTO board (Artist,Title,ReleaseDate,Production,Price)
        VALUES (#{Artist}, #{Title}, #{ReleaseDate},#{Production},#{Price})
        """)
    int insert(Board board);

    @Select("""
        SELECT Artist,Title,ReleaseDate,Production,Price, inserted
        FROM board
        ORDER BY Artist DESC
        """)
    List<Board> selectAll();

    @Select("""
        SELECT Artist,Title,ReleaseDate,Production,Cost, inserted
        FROM board
        WHERE Artist = #{Artist}
        """)
    Board selectById(Integer id);

    @Delete("""
        DELETE FROM board
        WHERE Artist = #{Artist}
        """)
    int deleteById(String Artist);
}