### Nama    : Fitrah Rahmadhani Ahmad  
### NIM     : 2141762092
### Kelas   : SIB-2E  
---
# Update Data MongoDB  
Perubahan data sering kali dapat dilakukan atau terjadi karena suatu alasan tertentu. Update data pada Mongo DB juga bisa terjadi karena adanya perubahan perancangan pada sistem yang mengharuskan satu atau beberapa data harus diubah. Terdapat dua query update pada Mongo DB, yaitu.  
1. Query updateOne()  
    Query updateOne() akan memperbarui data pertama yang ditemukan cocok dengan query yang telah disusun.Contoh terdapat data seperti di bawah ini dan akan dilakukan update pada field likes.     
    '[
        {
            _id: ObjectId("62c350dc07d768a33fdfe9b0"),
            title: 'Post Title 1',
            body: 'Body of post.',
            category: 'News',
            likes: 1,
            tags: [ 'news', 'events' ],
            date: 'Mon Jul 04 2022 15:43:08 GMT-0500 (Central Daylight Time)'
        }
    ]'  

    Query update:  
    'db.posts.updateOne( { title: "Post Title 1" }, { $set: { likes: 2 } } )'  
    *Keterangan: title digunakan sebagai indeks pencarian dan $set digunakan untuk memasukkan perubahan data*

  
