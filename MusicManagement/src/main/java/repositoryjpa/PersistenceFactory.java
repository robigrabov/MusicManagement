package repositoryjpa;

public interface PersistenceFactory {
    LabelRepositoryJPA labelRepository();
    AlbumRepositoryJPA albumRepository();
    ArtistRepositoryJPA artistRepository();
    SongRepositoryJPA songRepository();
}