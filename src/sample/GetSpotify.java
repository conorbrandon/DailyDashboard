package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetSpotify {
    static List<String> playlistList;
    static List<String> linksList;
    static List<String> imagesList;
    static String spotifyKey;

    public static void main(String[] args) {
        playlistList = new ArrayList<>();
        linksList = new ArrayList<>();
        imagesList = new ArrayList<>();
////        for (int i = 0; i < 7; i++) {
////            playlistList.add("Fake Playlist " + i);
////        }
//        playlistList.add("Liked Songs");
//        playlistList.add("tame crack");
//        playlistList.add("the motion");
//        playlistList.add("valid vibez");
//        playlistList.add("redux");
//        playlistList.add("HIGHEST IN THE ROOM");
        String httpResponse = "{\n" +
                "  \"href\": \"https://api.spotify.com/v1/users/csbozus/playlists?offset=0&limit=20\",\n" +
                "  \"items\": [\n" +
                "    {\n" +
                "      \"collaborative\": false,\n" +
                "      \"description\": \"\",\n" +
                "      \"external_urls\": {\n" +
                "        \"spotify\": \"https://open.spotify.com/playlist/3quOGne4jHNbM1o9M0eFCA\"\n" +
                "      },\n" +
                "      \"href\": \"https://api.spotify.com/v1/playlists/3quOGne4jHNbM1o9M0eFCA\",\n" +
                "      \"id\": \"3quOGne4jHNbM1o9M0eFCA\",\n" +
                "      \"images\": [\n" +
                "        {\n" +
                "          \"height\": 640,\n" +
                "          \"url\": \"https://mosaic.scdn.co/640/0988706eac690e65f0b685ee3f52b11496d5c9845a5d7f2d47f9c7cd636e344095f3cd1facdd9d0f761b5c05071053eef942fcdf9a6dc61de13fa1cdaecc17a489924b8e919b5f90bb103b00cab4d455\",\n" +
                "          \"width\": 640\n" +
                "        },\n" +
                "        {\n" +
                "          \"height\": 300,\n" +
                "          \"url\": \"https://mosaic.scdn.co/300/0988706eac690e65f0b685ee3f52b11496d5c9845a5d7f2d47f9c7cd636e344095f3cd1facdd9d0f761b5c05071053eef942fcdf9a6dc61de13fa1cdaecc17a489924b8e919b5f90bb103b00cab4d455\",\n" +
                "          \"width\": 300\n" +
                "        },\n" +
                "        {\n" +
                "          \"height\": 60,\n" +
                "          \"url\": \"https://mosaic.scdn.co/60/0988706eac690e65f0b685ee3f52b11496d5c9845a5d7f2d47f9c7cd636e344095f3cd1facdd9d0f761b5c05071053eef942fcdf9a6dc61de13fa1cdaecc17a489924b8e919b5f90bb103b00cab4d455\",\n" +
                "          \"width\": 60\n" +
                "        }\n" +
                "      ],\n" +
                "      \"name\": \"❣❣❣\",\n" +
                "      \"owner\": {\n" +
                "        \"display_name\": \"csbozus\",\n" +
                "        \"external_urls\": {\n" +
                "          \"spotify\": \"https://open.spotify.com/user/csbozus\"\n" +
                "        },\n" +
                "        \"href\": \"https://api.spotify.com/v1/users/csbozus\",\n" +
                "        \"id\": \"csbozus\",\n" +
                "        \"type\": \"user\",\n" +
                "        \"uri\": \"spotify:user:csbozus\"\n" +
                "      },\n" +
                "      \"primary_color\": null,\n" +
                "      \"public\": false,\n" +
                "      \"snapshot_id\": \"MTUsNjNhYTdhZDM5ODdkMGI0NzczZGFhZTY4MGNjOGM0ZDhiOWZlOTNiMw==\",\n" +
                "      \"tracks\": {\n" +
                "        \"href\": \"https://api.spotify.com/v1/playlists/3quOGne4jHNbM1o9M0eFCA/tracks\",\n" +
                "        \"total\": 21\n" +
                "      },\n" +
                "      \"type\": \"playlist\",\n" +
                "      \"uri\": \"spotify:playlist:3quOGne4jHNbM1o9M0eFCA\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"collaborative\": false,\n" +
                "      \"description\": \"\",\n" +
                "      \"external_urls\": {\n" +
                "        \"spotify\": \"https://open.spotify.com/playlist/5UvI4AVg6dHoweOysa3z5x\"\n" +
                "      },\n" +
                "      \"href\": \"https://api.spotify.com/v1/playlists/5UvI4AVg6dHoweOysa3z5x\",\n" +
                "      \"id\": \"5UvI4AVg6dHoweOysa3z5x\",\n" +
                "      \"images\": [\n" +
                "        {\n" +
                "          \"height\": 640,\n" +
                "          \"url\": \"https://i.scdn.co/image/ab67616d0000b27375a609817a8b9a5d1ea6911d\",\n" +
                "          \"width\": 640\n" +
                "        }\n" +
                "      ],\n" +
                "      \"name\": \"Summer Breaking\",\n" +
                "      \"owner\": {\n" +
                "        \"display_name\": \"csbozus\",\n" +
                "        \"external_urls\": {\n" +
                "          \"spotify\": \"https://open.spotify.com/user/csbozus\"\n" +
                "        },\n" +
                "        \"href\": \"https://api.spotify.com/v1/users/csbozus\",\n" +
                "        \"id\": \"csbozus\",\n" +
                "        \"type\": \"user\",\n" +
                "        \"uri\": \"spotify:user:csbozus\"\n" +
                "      },\n" +
                "      \"primary_color\": null,\n" +
                "      \"public\": false,\n" +
                "      \"snapshot_id\": \"NSw1MTdmOGNhYTk5MGJiNDMxOGQxNTkzZDRmNGE5YjNlODYzYmM0YTE3\",\n" +
                "      \"tracks\": {\n" +
                "        \"href\": \"https://api.spotify.com/v1/playlists/5UvI4AVg6dHoweOysa3z5x/tracks\",\n" +
                "        \"total\": 2\n" +
                "      },\n" +
                "      \"type\": \"playlist\",\n" +
                "      \"uri\": \"spotify:playlist:5UvI4AVg6dHoweOysa3z5x\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"collaborative\": false,\n" +
                "      \"description\": \"\",\n" +
                "      \"external_urls\": {\n" +
                "        \"spotify\": \"https://open.spotify.com/playlist/4d1FsF4rYVruKvMNN0dmqQ\"\n" +
                "      },\n" +
                "      \"href\": \"https://api.spotify.com/v1/playlists/4d1FsF4rYVruKvMNN0dmqQ\",\n" +
                "      \"id\": \"4d1FsF4rYVruKvMNN0dmqQ\",\n" +
                "      \"images\": [\n" +
                "        {\n" +
                "          \"height\": 640,\n" +
                "          \"url\": \"https://mosaic.scdn.co/640/0ddf1d320dd3a96ca3a45666fbbb9e0a6373529654138569c5675377d3b2fc5e23679b4e94a497726983416ed2934d891676f47c446327b0800a46f0c1cf3c1d0cf12fc9a6f313b56b8aa6cb56a07088\",\n" +
                "          \"width\": 640\n" +
                "        },\n" +
                "        {\n" +
                "          \"height\": 300,\n" +
                "          \"url\": \"https://mosaic.scdn.co/300/0ddf1d320dd3a96ca3a45666fbbb9e0a6373529654138569c5675377d3b2fc5e23679b4e94a497726983416ed2934d891676f47c446327b0800a46f0c1cf3c1d0cf12fc9a6f313b56b8aa6cb56a07088\",\n" +
                "          \"width\": 300\n" +
                "        },\n" +
                "        {\n" +
                "          \"height\": 60,\n" +
                "          \"url\": \"https://mosaic.scdn.co/60/0ddf1d320dd3a96ca3a45666fbbb9e0a6373529654138569c5675377d3b2fc5e23679b4e94a497726983416ed2934d891676f47c446327b0800a46f0c1cf3c1d0cf12fc9a6f313b56b8aa6cb56a07088\",\n" +
                "          \"width\": 60\n" +
                "        }\n" +
                "      ],\n" +
                "      \"name\": \"tame crack\",\n" +
                "      \"owner\": {\n" +
                "        \"display_name\": \"csbozus\",\n" +
                "        \"external_urls\": {\n" +
                "          \"spotify\": \"https://open.spotify.com/user/csbozus\"\n" +
                "        },\n" +
                "        \"href\": \"https://api.spotify.com/v1/users/csbozus\",\n" +
                "        \"id\": \"csbozus\",\n" +
                "        \"type\": \"user\",\n" +
                "        \"uri\": \"spotify:user:csbozus\"\n" +
                "      },\n" +
                "      \"primary_color\": null,\n" +
                "      \"public\": false,\n" +
                "      \"snapshot_id\": \"NSxjMTA5MTZmZWI3ZmQ5YzUxMWRjZTdkMDljNjhmZTYxMzYyOGY4NGZk\",\n" +
                "      \"tracks\": {\n" +
                "        \"href\": \"https://api.spotify.com/v1/playlists/4d1FsF4rYVruKvMNN0dmqQ/tracks\",\n" +
                "        \"total\": 4\n" +
                "      },\n" +
                "      \"type\": \"playlist\",\n" +
                "      \"uri\": \"spotify:playlist:4d1FsF4rYVruKvMNN0dmqQ\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"collaborative\": false,\n" +
                "      \"description\": \"\",\n" +
                "      \"external_urls\": {\n" +
                "        \"spotify\": \"https://open.spotify.com/playlist/5qMxfRzKuWdCJCyRarpUAC\"\n" +
                "      },\n" +
                "      \"href\": \"https://api.spotify.com/v1/playlists/5qMxfRzKuWdCJCyRarpUAC\",\n" +
                "      \"id\": \"5qMxfRzKuWdCJCyRarpUAC\",\n" +
                "      \"images\": [\n" +
                "        {\n" +
                "          \"height\": 640,\n" +
                "          \"url\": \"https://mosaic.scdn.co/640/ab67616d0000b273e0b64c8be3c4e804abcb2696ad89df63df27cd11aa789c2d3b452ca17aa00966e68dee85d7a026eadc5ae76e71efea0767479036f424b711dc3843845db9703c65649701264db126\",\n" +
                "          \"width\": 640\n" +
                "        },\n" +
                "        {\n" +
                "          \"height\": 300,\n" +
                "          \"url\": \"https://mosaic.scdn.co/300/ab67616d0000b273e0b64c8be3c4e804abcb2696ad89df63df27cd11aa789c2d3b452ca17aa00966e68dee85d7a026eadc5ae76e71efea0767479036f424b711dc3843845db9703c65649701264db126\",\n" +
                "          \"width\": 300\n" +
                "        },\n" +
                "        {\n" +
                "          \"height\": 60,\n" +
                "          \"url\": \"https://mosaic.scdn.co/60/ab67616d0000b273e0b64c8be3c4e804abcb2696ad89df63df27cd11aa789c2d3b452ca17aa00966e68dee85d7a026eadc5ae76e71efea0767479036f424b711dc3843845db9703c65649701264db126\",\n" +
                "          \"width\": 60\n" +
                "        }\n" +
                "      ],\n" +
                "      \"name\": \"the motion\",\n" +
                "      \"owner\": {\n" +
                "        \"display_name\": \"csbozus\",\n" +
                "        \"external_urls\": {\n" +
                "          \"spotify\": \"https://open.spotify.com/user/csbozus\"\n" +
                "        },\n" +
                "        \"href\": \"https://api.spotify.com/v1/users/csbozus\",\n" +
                "        \"id\": \"csbozus\",\n" +
                "        \"type\": \"user\",\n" +
                "        \"uri\": \"spotify:user:csbozus\"\n" +
                "      },\n" +
                "      \"primary_color\": null,\n" +
                "      \"public\": false,\n" +
                "      \"snapshot_id\": \"MTYsYTE3ZjA4MGRlY2Q2YzExOTNiMjZlNzBhZjViMzE3OWMyYTgyZTMxZA==\",\n" +
                "      \"tracks\": {\n" +
                "        \"href\": \"https://api.spotify.com/v1/playlists/5qMxfRzKuWdCJCyRarpUAC/tracks\",\n" +
                "        \"total\": 8\n" +
                "      },\n" +
                "      \"type\": \"playlist\",\n" +
                "      \"uri\": \"spotify:playlist:5qMxfRzKuWdCJCyRarpUAC\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"collaborative\": false,\n" +
                "      \"description\": \"\",\n" +
                "      \"external_urls\": {\n" +
                "        \"spotify\": \"https://open.spotify.com/playlist/0enUyWJ1z21fOxpmWSF3vH\"\n" +
                "      },\n" +
                "      \"href\": \"https://api.spotify.com/v1/playlists/0enUyWJ1z21fOxpmWSF3vH\",\n" +
                "      \"id\": \"0enUyWJ1z21fOxpmWSF3vH\",\n" +
                "      \"images\": [\n" +
                "        {\n" +
                "          \"height\": 640,\n" +
                "          \"url\": \"https://mosaic.scdn.co/640/22fd8793d524d3b9a089b0ea416e9999b77447c05ff618b7a57f460f564f05c6bc27b1b024c25844ab67616d0000b2736e5689a9d09ac1fc2cba2ab0ab67616d0000b273a5d104cb67deddfda1efdeb9\",\n" +
                "          \"width\": 640\n" +
                "        },\n" +
                "        {\n" +
                "          \"height\": 300,\n" +
                "          \"url\": \"https://mosaic.scdn.co/300/22fd8793d524d3b9a089b0ea416e9999b77447c05ff618b7a57f460f564f05c6bc27b1b024c25844ab67616d0000b2736e5689a9d09ac1fc2cba2ab0ab67616d0000b273a5d104cb67deddfda1efdeb9\",\n" +
                "          \"width\": 300\n" +
                "        },\n" +
                "        {\n" +
                "          \"height\": 60,\n" +
                "          \"url\": \"https://mosaic.scdn.co/60/22fd8793d524d3b9a089b0ea416e9999b77447c05ff618b7a57f460f564f05c6bc27b1b024c25844ab67616d0000b2736e5689a9d09ac1fc2cba2ab0ab67616d0000b273a5d104cb67deddfda1efdeb9\",\n" +
                "          \"width\": 60\n" +
                "        }\n" +
                "      ],\n" +
                "      \"name\": \"valid vibez\",\n" +
                "      \"owner\": {\n" +
                "        \"display_name\": \"anthony_1300\",\n" +
                "        \"external_urls\": {\n" +
                "          \"spotify\": \"https://open.spotify.com/user/anthony_1300\"\n" +
                "        },\n" +
                "        \"href\": \"https://api.spotify.com/v1/users/anthony_1300\",\n" +
                "        \"id\": \"anthony_1300\",\n" +
                "        \"type\": \"user\",\n" +
                "        \"uri\": \"spotify:user:anthony_1300\"\n" +
                "      },\n" +
                "      \"primary_color\": null,\n" +
                "      \"public\": false,\n" +
                "      \"snapshot_id\": \"MjQ1LGZjOGExYWU2NjMxZjY1YWUyMGVmZjQwMDdkNTk4NzRkODlmOTFiNmY=\",\n" +
                "      \"tracks\": {\n" +
                "        \"href\": \"https://api.spotify.com/v1/playlists/0enUyWJ1z21fOxpmWSF3vH/tracks\",\n" +
                "        \"total\": 179\n" +
                "      },\n" +
                "      \"type\": \"playlist\",\n" +
                "      \"uri\": \"spotify:playlist:0enUyWJ1z21fOxpmWSF3vH\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"collaborative\": false,\n" +
                "      \"description\": \"\",\n" +
                "      \"external_urls\": {\n" +
                "        \"spotify\": \"https://open.spotify.com/playlist/2umnex6fC2f6yXlkxN31UM\"\n" +
                "      },\n" +
                "      \"href\": \"https://api.spotify.com/v1/playlists/2umnex6fC2f6yXlkxN31UM\",\n" +
                "      \"id\": \"2umnex6fC2f6yXlkxN31UM\",\n" +
                "      \"images\": [\n" +
                "        {\n" +
                "          \"height\": 640,\n" +
                "          \"url\": \"https://i.scdn.co/image/e68dee85d7a026eadc5ae76e71efea0767479036\",\n" +
                "          \"width\": 640\n" +
                "        }\n" +
                "      ],\n" +
                "      \"name\": \"HIGHEST IN THE ROOM\",\n" +
                "      \"owner\": {\n" +
                "        \"display_name\": \"csbozus\",\n" +
                "        \"external_urls\": {\n" +
                "          \"spotify\": \"https://open.spotify.com/user/csbozus\"\n" +
                "        },\n" +
                "        \"href\": \"https://api.spotify.com/v1/users/csbozus\",\n" +
                "        \"id\": \"csbozus\",\n" +
                "        \"type\": \"user\",\n" +
                "        \"uri\": \"spotify:user:csbozus\"\n" +
                "      },\n" +
                "      \"primary_color\": null,\n" +
                "      \"public\": false,\n" +
                "      \"snapshot_id\": \"Nyw4NTdhY2ExZGY3Y2U2NjQ0N2E4MDBkMTJlNDc3Yzk4MTc2NTVkZDk4\",\n" +
                "      \"tracks\": {\n" +
                "        \"href\": \"https://api.spotify.com/v1/playlists/2umnex6fC2f6yXlkxN31UM/tracks\",\n" +
                "        \"total\": 5\n" +
                "      },\n" +
                "      \"type\": \"playlist\",\n" +
                "      \"uri\": \"spotify:playlist:2umnex6fC2f6yXlkxN31UM\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"collaborative\": false,\n" +
                "      \"description\": \"\",\n" +
                "      \"external_urls\": {\n" +
                "        \"spotify\": \"https://open.spotify.com/playlist/7zg2HEma7YDKOlUQstH99p\"\n" +
                "      },\n" +
                "      \"href\": \"https://api.spotify.com/v1/playlists/7zg2HEma7YDKOlUQstH99p\",\n" +
                "      \"id\": \"7zg2HEma7YDKOlUQstH99p\",\n" +
                "      \"images\": [\n" +
                "        {\n" +
                "          \"height\": 640,\n" +
                "          \"url\": \"https://mosaic.scdn.co/640/ab67616d0000b273507396e3c0a8d295dcc2d219ab67616d0000b273b2bea62059e9ed893b9831a7ab67616d0000b273c3ee764784efabd9cf081e34e679a351b106693e32cdd9acd0abd3976110fbba\",\n" +
                "          \"width\": 640\n" +
                "        },\n" +
                "        {\n" +
                "          \"height\": 300,\n" +
                "          \"url\": \"https://mosaic.scdn.co/300/ab67616d0000b273507396e3c0a8d295dcc2d219ab67616d0000b273b2bea62059e9ed893b9831a7ab67616d0000b273c3ee764784efabd9cf081e34e679a351b106693e32cdd9acd0abd3976110fbba\",\n" +
                "          \"width\": 300\n" +
                "        },\n" +
                "        {\n" +
                "          \"height\": 60,\n" +
                "          \"url\": \"https://mosaic.scdn.co/60/ab67616d0000b273507396e3c0a8d295dcc2d219ab67616d0000b273b2bea62059e9ed893b9831a7ab67616d0000b273c3ee764784efabd9cf081e34e679a351b106693e32cdd9acd0abd3976110fbba\",\n" +
                "          \"width\": 60\n" +
                "        }\n" +
                "      ],\n" +
                "      \"name\": \"redux\",\n" +
                "      \"owner\": {\n" +
                "        \"display_name\": \"csbozus\",\n" +
                "        \"external_urls\": {\n" +
                "          \"spotify\": \"https://open.spotify.com/user/csbozus\"\n" +
                "        },\n" +
                "        \"href\": \"https://api.spotify.com/v1/users/csbozus\",\n" +
                "        \"id\": \"csbozus\",\n" +
                "        \"type\": \"user\",\n" +
                "        \"uri\": \"spotify:user:csbozus\"\n" +
                "      },\n" +
                "      \"primary_color\": null,\n" +
                "      \"public\": false,\n" +
                "      \"snapshot_id\": \"MTUsMWNkY2UzYmUzYmY1YWRjYWRlNWM3NjVjMjkzNzQzMzJmOWY0MjlkZQ==\",\n" +
                "      \"tracks\": {\n" +
                "        \"href\": \"https://api.spotify.com/v1/playlists/7zg2HEma7YDKOlUQstH99p/tracks\",\n" +
                "        \"total\": 10\n" +
                "      },\n" +
                "      \"type\": \"playlist\",\n" +
                "      \"uri\": \"spotify:playlist:7zg2HEma7YDKOlUQstH99p\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"collaborative\": false,\n" +
                "      \"description\": \"\",\n" +
                "      \"external_urls\": {\n" +
                "        \"spotify\": \"https://open.spotify.com/playlist/2JGQSlr023PHbDd1l8L17p\"\n" +
                "      },\n" +
                "      \"href\": \"https://api.spotify.com/v1/playlists/2JGQSlr023PHbDd1l8L17p\",\n" +
                "      \"id\": \"2JGQSlr023PHbDd1l8L17p\",\n" +
                "      \"images\": [\n" +
                "        {\n" +
                "          \"height\": 640,\n" +
                "          \"url\": \"https://mosaic.scdn.co/640/249248e704f34007898ef0465f3c2b1c521d434799aedf0238d2043107763d5805392646add75e2aab67616d0000b273c03f8ef4160b2a3b72dd407dab67616d0000b273d7ec0859863a41a35d5e8e32\",\n" +
                "          \"width\": 640\n" +
                "        },\n" +
                "        {\n" +
                "          \"height\": 300,\n" +
                "          \"url\": \"https://mosaic.scdn.co/300/249248e704f34007898ef0465f3c2b1c521d434799aedf0238d2043107763d5805392646add75e2aab67616d0000b273c03f8ef4160b2a3b72dd407dab67616d0000b273d7ec0859863a41a35d5e8e32\",\n" +
                "          \"width\": 300\n" +
                "        },\n" +
                "        {\n" +
                "          \"height\": 60,\n" +
                "          \"url\": \"https://mosaic.scdn.co/60/249248e704f34007898ef0465f3c2b1c521d434799aedf0238d2043107763d5805392646add75e2aab67616d0000b273c03f8ef4160b2a3b72dd407dab67616d0000b273d7ec0859863a41a35d5e8e32\",\n" +
                "          \"width\": 60\n" +
                "        }\n" +
                "      ],\n" +
                "      \"name\": \"\uD83D\uDCA8\",\n" +
                "      \"owner\": {\n" +
                "        \"display_name\": \"csbozus\",\n" +
                "        \"external_urls\": {\n" +
                "          \"spotify\": \"https://open.spotify.com/user/csbozus\"\n" +
                "        },\n" +
                "        \"href\": \"https://api.spotify.com/v1/users/csbozus\",\n" +
                "        \"id\": \"csbozus\",\n" +
                "        \"type\": \"user\",\n" +
                "        \"uri\": \"spotify:user:csbozus\"\n" +
                "      },\n" +
                "      \"primary_color\": null,\n" +
                "      \"public\": false,\n" +
                "      \"snapshot_id\": \"MjMsMTU3MzE3NDY0NWYyNzdhYjA3OWZhMTcxY2FiOWUyNGE4MmY2YjJjNw==\",\n" +
                "      \"tracks\": {\n" +
                "        \"href\": \"https://api.spotify.com/v1/playlists/2JGQSlr023PHbDd1l8L17p/tracks\",\n" +
                "        \"total\": 29\n" +
                "      },\n" +
                "      \"type\": \"playlist\",\n" +
                "      \"uri\": \"spotify:playlist:2JGQSlr023PHbDd1l8L17p\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"collaborative\": false,\n" +
                "      \"description\": \"\",\n" +
                "      \"external_urls\": {\n" +
                "        \"spotify\": \"https://open.spotify.com/playlist/0sgstzscgXlgnaa1I4ZzJS\"\n" +
                "      },\n" +
                "      \"href\": \"https://api.spotify.com/v1/playlists/0sgstzscgXlgnaa1I4ZzJS\",\n" +
                "      \"id\": \"0sgstzscgXlgnaa1I4ZzJS\",\n" +
                "      \"images\": [\n" +
                "        {\n" +
                "          \"height\": 640,\n" +
                "          \"url\": \"https://mosaic.scdn.co/640/ab67616d0000b27314eb5ef4d6fb24b37b6531a6ab67616d0000b27386b0c9728ad3ed338eaeea79ab67616d0000b273f2486b438645e97b523e4f90b5ab6399c869a46fc00fe8a9bc2b36228f744812\",\n" +
                "          \"width\": 640\n" +
                "        },\n" +
                "        {\n" +
                "          \"height\": 300,\n" +
                "          \"url\": \"https://mosaic.scdn.co/300/ab67616d0000b27314eb5ef4d6fb24b37b6531a6ab67616d0000b27386b0c9728ad3ed338eaeea79ab67616d0000b273f2486b438645e97b523e4f90b5ab6399c869a46fc00fe8a9bc2b36228f744812\",\n" +
                "          \"width\": 300\n" +
                "        },\n" +
                "        {\n" +
                "          \"height\": 60,\n" +
                "          \"url\": \"https://mosaic.scdn.co/60/ab67616d0000b27314eb5ef4d6fb24b37b6531a6ab67616d0000b27386b0c9728ad3ed338eaeea79ab67616d0000b273f2486b438645e97b523e4f90b5ab6399c869a46fc00fe8a9bc2b36228f744812\",\n" +
                "          \"width\": 60\n" +
                "        }\n" +
                "      ],\n" +
                "      \"name\": \"\uD83D\uDC36 \uD83D\uDC17\",\n" +
                "      \"owner\": {\n" +
                "        \"display_name\": \"csbozus\",\n" +
                "        \"external_urls\": {\n" +
                "          \"spotify\": \"https://open.spotify.com/user/csbozus\"\n" +
                "        },\n" +
                "        \"href\": \"https://api.spotify.com/v1/users/csbozus\",\n" +
                "        \"id\": \"csbozus\",\n" +
                "        \"type\": \"user\",\n" +
                "        \"uri\": \"spotify:user:csbozus\"\n" +
                "      },\n" +
                "      \"primary_color\": null,\n" +
                "      \"public\": false,\n" +
                "      \"snapshot_id\": \"MTcsYzY3M2Y1ZDIwYmRjNTFkODMyZmUyZDc2MzU5YTQwNzIwYzJkZGNkYw==\",\n" +
                "      \"tracks\": {\n" +
                "        \"href\": \"https://api.spotify.com/v1/playlists/0sgstzscgXlgnaa1I4ZzJS/tracks\",\n" +
                "        \"total\": 13\n" +
                "      },\n" +
                "      \"type\": \"playlist\",\n" +
                "      \"uri\": \"spotify:playlist:0sgstzscgXlgnaa1I4ZzJS\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"collaborative\": false,\n" +
                "      \"description\": \"\",\n" +
                "      \"external_urls\": {\n" +
                "        \"spotify\": \"https://open.spotify.com/playlist/2bcy6yjLFg7aKKEHUKetcd\"\n" +
                "      },\n" +
                "      \"href\": \"https://api.spotify.com/v1/playlists/2bcy6yjLFg7aKKEHUKetcd\",\n" +
                "      \"id\": \"2bcy6yjLFg7aKKEHUKetcd\",\n" +
                "      \"images\": [\n" +
                "        {\n" +
                "          \"height\": 640,\n" +
                "          \"url\": \"https://mosaic.scdn.co/640/68c3d5e3c4aa5e98bb4f0b8ce90bd0e44ed8da19ab67616d0000b27358406b3f1ac3ceaff7a64fefab67616d0000b27391dec425eb653d7cbfa7620fab67616d0000b273aaba065944cd82a6f15c86b6\",\n" +
                "          \"width\": 640\n" +
                "        },\n" +
                "        {\n" +
                "          \"height\": 300,\n" +
                "          \"url\": \"https://mosaic.scdn.co/300/68c3d5e3c4aa5e98bb4f0b8ce90bd0e44ed8da19ab67616d0000b27358406b3f1ac3ceaff7a64fefab67616d0000b27391dec425eb653d7cbfa7620fab67616d0000b273aaba065944cd82a6f15c86b6\",\n" +
                "          \"width\": 300\n" +
                "        },\n" +
                "        {\n" +
                "          \"height\": 60,\n" +
                "          \"url\": \"https://mosaic.scdn.co/60/68c3d5e3c4aa5e98bb4f0b8ce90bd0e44ed8da19ab67616d0000b27358406b3f1ac3ceaff7a64fefab67616d0000b27391dec425eb653d7cbfa7620fab67616d0000b273aaba065944cd82a6f15c86b6\",\n" +
                "          \"width\": 60\n" +
                "        }\n" +
                "      ],\n" +
                "      \"name\": \"\uD83D\uDD58\",\n" +
                "      \"owner\": {\n" +
                "        \"display_name\": \"csbozus\",\n" +
                "        \"external_urls\": {\n" +
                "          \"spotify\": \"https://open.spotify.com/user/csbozus\"\n" +
                "        },\n" +
                "        \"href\": \"https://api.spotify.com/v1/users/csbozus\",\n" +
                "        \"id\": \"csbozus\",\n" +
                "        \"type\": \"user\",\n" +
                "        \"uri\": \"spotify:user:csbozus\"\n" +
                "      },\n" +
                "      \"primary_color\": null,\n" +
                "      \"public\": false,\n" +
                "      \"snapshot_id\": \"MTYsMTg1NmIyYzI5ODRiZjQ3ODE0OWY4ZTIzODE4MGYxYmFmYmFmNWE5ZA==\",\n" +
                "      \"tracks\": {\n" +
                "        \"href\": \"https://api.spotify.com/v1/playlists/2bcy6yjLFg7aKKEHUKetcd/tracks\",\n" +
                "        \"total\": 14\n" +
                "      },\n" +
                "      \"type\": \"playlist\",\n" +
                "      \"uri\": \"spotify:playlist:2bcy6yjLFg7aKKEHUKetcd\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"collaborative\": false,\n" +
                "      \"description\": \"The chillest instrumental lofi beats, certified lush.\",\n" +
                "      \"external_urls\": {\n" +
                "        \"spotify\": \"https://open.spotify.com/playlist/37i9dQZF1DXc8kgYqQLMfH\"\n" +
                "      },\n" +
                "      \"href\": \"https://api.spotify.com/v1/playlists/37i9dQZF1DXc8kgYqQLMfH\",\n" +
                "      \"id\": \"37i9dQZF1DXc8kgYqQLMfH\",\n" +
                "      \"images\": [\n" +
                "        {\n" +
                "          \"height\": null,\n" +
                "          \"url\": \"https://i.scdn.co/image/ab67706f00000002a26911885a1acf38f16c5d51\",\n" +
                "          \"width\": null\n" +
                "        }\n" +
                "      ],\n" +
                "      \"name\": \"Lush Lofi\",\n" +
                "      \"owner\": {\n" +
                "        \"display_name\": \"Spotify\",\n" +
                "        \"external_urls\": {\n" +
                "          \"spotify\": \"https://open.spotify.com/user/spotify\"\n" +
                "        },\n" +
                "        \"href\": \"https://api.spotify.com/v1/users/spotify\",\n" +
                "        \"id\": \"spotify\",\n" +
                "        \"type\": \"user\",\n" +
                "        \"uri\": \"spotify:user:spotify\"\n" +
                "      },\n" +
                "      \"primary_color\": null,\n" +
                "      \"public\": false,\n" +
                "      \"snapshot_id\": \"MTU3NDg2MjgzMiwwMDAwMDA4YzAwMDAwMTZlYWQyM2MzZjkwMDAwMDE2ZDE1M2M2ZmNl\",\n" +
                "      \"tracks\": {\n" +
                "        \"href\": \"https://api.spotify.com/v1/playlists/37i9dQZF1DXc8kgYqQLMfH/tracks\",\n" +
                "        \"total\": 130\n" +
                "      },\n" +
                "      \"type\": \"playlist\",\n" +
                "      \"uri\": \"spotify:playlist:37i9dQZF1DXc8kgYqQLMfH\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"collaborative\": false,\n" +
                "      \"description\": \"A kaleidoscopic journey from Kevin Parker's bedroom to the world stage - these are the majestic sounds of Tame Impala.\",\n" +
                "      \"external_urls\": {\n" +
                "        \"spotify\": \"https://open.spotify.com/playlist/37i9dQZF1DX2zsdpDHp0xI\"\n" +
                "      },\n" +
                "      \"href\": \"https://api.spotify.com/v1/playlists/37i9dQZF1DX2zsdpDHp0xI\",\n" +
                "      \"id\": \"37i9dQZF1DX2zsdpDHp0xI\",\n" +
                "      \"images\": [\n" +
                "        {\n" +
                "          \"height\": null,\n" +
                "          \"url\": \"https://pl.scdn.co/images/pl/default/2d5748be49fa180f72e8301c6ebf12e44d55d48f\",\n" +
                "          \"width\": null\n" +
                "        }\n" +
                "      ],\n" +
                "      \"name\": \"This Is Tame Impala\",\n" +
                "      \"owner\": {\n" +
                "        \"display_name\": \"Spotify\",\n" +
                "        \"external_urls\": {\n" +
                "          \"spotify\": \"https://open.spotify.com/user/spotify\"\n" +
                "        },\n" +
                "        \"href\": \"https://api.spotify.com/v1/users/spotify\",\n" +
                "        \"id\": \"spotify\",\n" +
                "        \"type\": \"user\",\n" +
                "        \"uri\": \"spotify:user:spotify\"\n" +
                "      },\n" +
                "      \"primary_color\": null,\n" +
                "      \"public\": false,\n" +
                "      \"snapshot_id\": \"MTU3NTQxMDkxNCwwMDAwMDAwYzAwMDAwMTZlY2RjZWQ0MDUwMDAwMDE2ZTI0MDQ2YjNk\",\n" +
                "      \"tracks\": {\n" +
                "        \"href\": \"https://api.spotify.com/v1/playlists/37i9dQZF1DX2zsdpDHp0xI/tracks\",\n" +
                "        \"total\": 43\n" +
                "      },\n" +
                "      \"type\": \"playlist\",\n" +
                "      \"uri\": \"spotify:playlist:37i9dQZF1DX2zsdpDHp0xI\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"collaborative\": false,\n" +
                "      \"description\": \"LP4 'The Slow Rush' out February 14 2020.\",\n" +
                "      \"external_urls\": {\n" +
                "        \"spotify\": \"https://open.spotify.com/playlist/4wmXlb759ceIV2O4JRWjSo\"\n" +
                "      },\n" +
                "      \"href\": \"https://api.spotify.com/v1/playlists/4wmXlb759ceIV2O4JRWjSo\",\n" +
                "      \"id\": \"4wmXlb759ceIV2O4JRWjSo\",\n" +
                "      \"images\": [\n" +
                "        {\n" +
                "          \"height\": null,\n" +
                "          \"url\": \"https://pl.scdn.co/images/pl/default/24f06c7eef232944f4ecccb0c58e80146f899fa5\",\n" +
                "          \"width\": null\n" +
                "        }\n" +
                "      ],\n" +
                "      \"name\": \"Tame Impala Complete\",\n" +
                "      \"owner\": {\n" +
                "        \"display_name\": \"Tame Impala\",\n" +
                "        \"external_urls\": {\n" +
                "          \"spotify\": \"https://open.spotify.com/user/tame_impala\"\n" +
                "        },\n" +
                "        \"href\": \"https://api.spotify.com/v1/users/tame_impala\",\n" +
                "        \"id\": \"tame_impala\",\n" +
                "        \"type\": \"user\",\n" +
                "        \"uri\": \"spotify:user:tame_impala\"\n" +
                "      },\n" +
                "      \"primary_color\": null,\n" +
                "      \"public\": false,\n" +
                "      \"snapshot_id\": \"OTAsNzFlOGQzZmMxNjc4YmI4NTVkZTcxMmRjOTk4YTc0NWNiYzdmYzA4Mg==\",\n" +
                "      \"tracks\": {\n" +
                "        \"href\": \"https://api.spotify.com/v1/playlists/4wmXlb759ceIV2O4JRWjSo/tracks\",\n" +
                "        \"total\": 88\n" +
                "      },\n" +
                "      \"type\": \"playlist\",\n" +
                "      \"uri\": \"spotify:playlist:4wmXlb759ceIV2O4JRWjSo\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"collaborative\": false,\n" +
                "      \"description\": \"\",\n" +
                "      \"external_urls\": {\n" +
                "        \"spotify\": \"https://open.spotify.com/playlist/4sSOMXOgPGZeavW82iQLrL\"\n" +
                "      },\n" +
                "      \"href\": \"https://api.spotify.com/v1/playlists/4sSOMXOgPGZeavW82iQLrL\",\n" +
                "      \"id\": \"4sSOMXOgPGZeavW82iQLrL\",\n" +
                "      \"images\": [\n" +
                "        {\n" +
                "          \"height\": 640,\n" +
                "          \"url\": \"https://mosaic.scdn.co/640/249248e704f34007898ef0465f3c2b1c521d4347437c65e86e4a5e8e42889e4c5496cdb409e8913d99aedf0238d2043107763d5805392646add75e2aab67616d0000b27375a609817a8b9a5d1ea6911d\",\n" +
                "          \"width\": 640\n" +
                "        },\n" +
                "        {\n" +
                "          \"height\": 300,\n" +
                "          \"url\": \"https://mosaic.scdn.co/300/249248e704f34007898ef0465f3c2b1c521d4347437c65e86e4a5e8e42889e4c5496cdb409e8913d99aedf0238d2043107763d5805392646add75e2aab67616d0000b27375a609817a8b9a5d1ea6911d\",\n" +
                "          \"width\": 300\n" +
                "        },\n" +
                "        {\n" +
                "          \"height\": 60,\n" +
                "          \"url\": \"https://mosaic.scdn.co/60/249248e704f34007898ef0465f3c2b1c521d4347437c65e86e4a5e8e42889e4c5496cdb409e8913d99aedf0238d2043107763d5805392646add75e2aab67616d0000b27375a609817a8b9a5d1ea6911d\",\n" +
                "          \"width\": 60\n" +
                "        }\n" +
                "      ],\n" +
                "      \"name\": \"Tame Impala\",\n" +
                "      \"owner\": {\n" +
                "        \"display_name\": \"csbozus\",\n" +
                "        \"external_urls\": {\n" +
                "          \"spotify\": \"https://open.spotify.com/user/csbozus\"\n" +
                "        },\n" +
                "        \"href\": \"https://api.spotify.com/v1/users/csbozus\",\n" +
                "        \"id\": \"csbozus\",\n" +
                "        \"type\": \"user\",\n" +
                "        \"uri\": \"spotify:user:csbozus\"\n" +
                "      },\n" +
                "      \"primary_color\": null,\n" +
                "      \"public\": false,\n" +
                "      \"snapshot_id\": \"MjAsNzg2M2ZlOWIzNzcxNDU4ZWZjNmE4NjFmYjM4NmE3MWE3MDUwMzk3Ng==\",\n" +
                "      \"tracks\": {\n" +
                "        \"href\": \"https://api.spotify.com/v1/playlists/4sSOMXOgPGZeavW82iQLrL/tracks\",\n" +
                "        \"total\": 18\n" +
                "      },\n" +
                "      \"type\": \"playlist\",\n" +
                "      \"uri\": \"spotify:playlist:4sSOMXOgPGZeavW82iQLrL\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"collaborative\": false,\n" +
                "      \"description\": \"\",\n" +
                "      \"external_urls\": {\n" +
                "        \"spotify\": \"https://open.spotify.com/playlist/6WqHYiSPH2TRfNojrHMfXw\"\n" +
                "      },\n" +
                "      \"href\": \"https://api.spotify.com/v1/playlists/6WqHYiSPH2TRfNojrHMfXw\",\n" +
                "      \"id\": \"6WqHYiSPH2TRfNojrHMfXw\",\n" +
                "      \"images\": [\n" +
                "        {\n" +
                "          \"height\": 640,\n" +
                "          \"url\": \"https://mosaic.scdn.co/640/0f995827d01ca2621d0a684506e50d2363f8ab4eab67616d0000b273072e9faef2ef7b6db63834a3ab67616d0000b2737433176f037e0ba14190c34fab67616d0000b273f54b99bf27cda88f4a7403ce\",\n" +
                "          \"width\": 640\n" +
                "        },\n" +
                "        {\n" +
                "          \"height\": 300,\n" +
                "          \"url\": \"https://mosaic.scdn.co/300/0f995827d01ca2621d0a684506e50d2363f8ab4eab67616d0000b273072e9faef2ef7b6db63834a3ab67616d0000b2737433176f037e0ba14190c34fab67616d0000b273f54b99bf27cda88f4a7403ce\",\n" +
                "          \"width\": 300\n" +
                "        },\n" +
                "        {\n" +
                "          \"height\": 60,\n" +
                "          \"url\": \"https://mosaic.scdn.co/60/0f995827d01ca2621d0a684506e50d2363f8ab4eab67616d0000b273072e9faef2ef7b6db63834a3ab67616d0000b2737433176f037e0ba14190c34fab67616d0000b273f54b99bf27cda88f4a7403ce\",\n" +
                "          \"width\": 60\n" +
                "        }\n" +
                "      ],\n" +
                "      \"name\": \"Travis\",\n" +
                "      \"owner\": {\n" +
                "        \"display_name\": \"csbozus\",\n" +
                "        \"external_urls\": {\n" +
                "          \"spotify\": \"https://open.spotify.com/user/csbozus\"\n" +
                "        },\n" +
                "        \"href\": \"https://api.spotify.com/v1/users/csbozus\",\n" +
                "        \"id\": \"csbozus\",\n" +
                "        \"type\": \"user\",\n" +
                "        \"uri\": \"spotify:user:csbozus\"\n" +
                "      },\n" +
                "      \"primary_color\": null,\n" +
                "      \"public\": false,\n" +
                "      \"snapshot_id\": \"MzcsOTdhYzNjMTI0NTRhZjMwYWFlZGQzZjM1NjM3YmYyODQ3M2Q2MTkwZg==\",\n" +
                "      \"tracks\": {\n" +
                "        \"href\": \"https://api.spotify.com/v1/playlists/6WqHYiSPH2TRfNojrHMfXw/tracks\",\n" +
                "        \"total\": 38\n" +
                "      },\n" +
                "      \"type\": \"playlist\",\n" +
                "      \"uri\": \"spotify:playlist:6WqHYiSPH2TRfNojrHMfXw\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"collaborative\": false,\n" +
                "      \"description\": \"\",\n" +
                "      \"external_urls\": {\n" +
                "        \"spotify\": \"https://open.spotify.com/playlist/0Z99e5J63qUpbgP3BIP0kv\"\n" +
                "      },\n" +
                "      \"href\": \"https://api.spotify.com/v1/playlists/0Z99e5J63qUpbgP3BIP0kv\",\n" +
                "      \"id\": \"0Z99e5J63qUpbgP3BIP0kv\",\n" +
                "      \"images\": [\n" +
                "        {\n" +
                "          \"height\": 640,\n" +
                "          \"url\": \"https://mosaic.scdn.co/640/73b0d8a1aee09dd3e14e14ee1b8bd4bd614669f0ab67616d0000b27331ca7222da4afdc7366d64fbab67616d0000b273c85676e37cf146675a250054dc627b2686233921c45a80243d0e6aeb08a6e5bf\",\n" +
                "          \"width\": 640\n" +
                "        },\n" +
                "        {\n" +
                "          \"height\": 300,\n" +
                "          \"url\": \"https://mosaic.scdn.co/300/73b0d8a1aee09dd3e14e14ee1b8bd4bd614669f0ab67616d0000b27331ca7222da4afdc7366d64fbab67616d0000b273c85676e37cf146675a250054dc627b2686233921c45a80243d0e6aeb08a6e5bf\",\n" +
                "          \"width\": 300\n" +
                "        },\n" +
                "        {\n" +
                "          \"height\": 60,\n" +
                "          \"url\": \"https://mosaic.scdn.co/60/73b0d8a1aee09dd3e14e14ee1b8bd4bd614669f0ab67616d0000b27331ca7222da4afdc7366d64fbab67616d0000b273c85676e37cf146675a250054dc627b2686233921c45a80243d0e6aeb08a6e5bf\",\n" +
                "          \"width\": 60\n" +
                "        }\n" +
                "      ],\n" +
                "      \"name\": \"good ol' days\",\n" +
                "      \"owner\": {\n" +
                "        \"display_name\": \"anthony_1300\",\n" +
                "        \"external_urls\": {\n" +
                "          \"spotify\": \"https://open.spotify.com/user/anthony_1300\"\n" +
                "        },\n" +
                "        \"href\": \"https://api.spotify.com/v1/users/anthony_1300\",\n" +
                "        \"id\": \"anthony_1300\",\n" +
                "        \"type\": \"user\",\n" +
                "        \"uri\": \"spotify:user:anthony_1300\"\n" +
                "      },\n" +
                "      \"primary_color\": null,\n" +
                "      \"public\": false,\n" +
                "      \"snapshot_id\": \"MzUzLGE3Y2Y0NDU0MTdlNWE2NjU3YjZiZDdmMjY0ODE1YzBjYmI2NzM3MmM=\",\n" +
                "      \"tracks\": {\n" +
                "        \"href\": \"https://api.spotify.com/v1/playlists/0Z99e5J63qUpbgP3BIP0kv/tracks\",\n" +
                "        \"total\": 329\n" +
                "      },\n" +
                "      \"type\": \"playlist\",\n" +
                "      \"uri\": \"spotify:playlist:0Z99e5J63qUpbgP3BIP0kv\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"collaborative\": false,\n" +
                "      \"description\": \"\",\n" +
                "      \"external_urls\": {\n" +
                "        \"spotify\": \"https://open.spotify.com/playlist/07t15raCJdTSygHJMhrpWN\"\n" +
                "      },\n" +
                "      \"href\": \"https://api.spotify.com/v1/playlists/07t15raCJdTSygHJMhrpWN\",\n" +
                "      \"id\": \"07t15raCJdTSygHJMhrpWN\",\n" +
                "      \"images\": [\n" +
                "        {\n" +
                "          \"height\": null,\n" +
                "          \"url\": \"https://pl.scdn.co/images/pl/default/b5faeff81de540880f68a345bdd3630bd1057a23\",\n" +
                "          \"width\": null\n" +
                "        }\n" +
                "      ],\n" +
                "      \"name\": \"widest range\",\n" +
                "      \"owner\": {\n" +
                "        \"display_name\": \"anthony_1300\",\n" +
                "        \"external_urls\": {\n" +
                "          \"spotify\": \"https://open.spotify.com/user/anthony_1300\"\n" +
                "        },\n" +
                "        \"href\": \"https://api.spotify.com/v1/users/anthony_1300\",\n" +
                "        \"id\": \"anthony_1300\",\n" +
                "        \"type\": \"user\",\n" +
                "        \"uri\": \"spotify:user:anthony_1300\"\n" +
                "      },\n" +
                "      \"primary_color\": null,\n" +
                "      \"public\": false,\n" +
                "      \"snapshot_id\": \"ODc0LDI3NmM3MTJmZmYzMDlmMzg4Nzc3YWYxNmUxMzE1YzUzNGU1ZDdmZGI=\",\n" +
                "      \"tracks\": {\n" +
                "        \"href\": \"https://api.spotify.com/v1/playlists/07t15raCJdTSygHJMhrpWN/tracks\",\n" +
                "        \"total\": 691\n" +
                "      },\n" +
                "      \"type\": \"playlist\",\n" +
                "      \"uri\": \"spotify:playlist:07t15raCJdTSygHJMhrpWN\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"collaborative\": false,\n" +
                "      \"description\": \"\",\n" +
                "      \"external_urls\": {\n" +
                "        \"spotify\": \"https://open.spotify.com/playlist/5BrUDnWcoxMVzHrV3Jl9yh\"\n" +
                "      },\n" +
                "      \"href\": \"https://api.spotify.com/v1/playlists/5BrUDnWcoxMVzHrV3Jl9yh\",\n" +
                "      \"id\": \"5BrUDnWcoxMVzHrV3Jl9yh\",\n" +
                "      \"images\": [\n" +
                "        {\n" +
                "          \"height\": 640,\n" +
                "          \"url\": \"https://mosaic.scdn.co/640/ab67616d0000b273644681440f5bf0fa272b0745ab67616d0000b273752d2becbb91841a31c556b8ab67616d0000b27381a3e039b66fffaecbba31e2bc200d3297fd526d0567aa9b606281837cec81ac\",\n" +
                "          \"width\": 640\n" +
                "        },\n" +
                "        {\n" +
                "          \"height\": 300,\n" +
                "          \"url\": \"https://mosaic.scdn.co/300/ab67616d0000b273644681440f5bf0fa272b0745ab67616d0000b273752d2becbb91841a31c556b8ab67616d0000b27381a3e039b66fffaecbba31e2bc200d3297fd526d0567aa9b606281837cec81ac\",\n" +
                "          \"width\": 300\n" +
                "        },\n" +
                "        {\n" +
                "          \"height\": 60,\n" +
                "          \"url\": \"https://mosaic.scdn.co/60/ab67616d0000b273644681440f5bf0fa272b0745ab67616d0000b273752d2becbb91841a31c556b8ab67616d0000b27381a3e039b66fffaecbba31e2bc200d3297fd526d0567aa9b606281837cec81ac\",\n" +
                "          \"width\": 60\n" +
                "        }\n" +
                "      ],\n" +
                "      \"name\": \"Blue Lips\",\n" +
                "      \"owner\": {\n" +
                "        \"display_name\": \"csbozus\",\n" +
                "        \"external_urls\": {\n" +
                "          \"spotify\": \"https://open.spotify.com/user/csbozus\"\n" +
                "        },\n" +
                "        \"href\": \"https://api.spotify.com/v1/users/csbozus\",\n" +
                "        \"id\": \"csbozus\",\n" +
                "        \"type\": \"user\",\n" +
                "        \"uri\": \"spotify:user:csbozus\"\n" +
                "      },\n" +
                "      \"primary_color\": null,\n" +
                "      \"public\": false,\n" +
                "      \"snapshot_id\": \"OCw4OGYyNzU0MTQ0ODg4YWQ3YTM3OGZiODVmNjA3NDQyNjRiZTRkZmU2\",\n" +
                "      \"tracks\": {\n" +
                "        \"href\": \"https://api.spotify.com/v1/playlists/5BrUDnWcoxMVzHrV3Jl9yh/tracks\",\n" +
                "        \"total\": 7\n" +
                "      },\n" +
                "      \"type\": \"playlist\",\n" +
                "      \"uri\": \"spotify:playlist:5BrUDnWcoxMVzHrV3Jl9yh\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"collaborative\": false,\n" +
                "      \"description\": \"<a href=\\\"spotify:genre:edm_dance\\\">The dance music condition</a> with Galantis.\",\n" +
                "      \"external_urls\": {\n" +
                "        \"spotify\": \"https://open.spotify.com/playlist/37i9dQZF1DX4dyzvuaRJ0n\"\n" +
                "      },\n" +
                "      \"href\": \"https://api.spotify.com/v1/playlists/37i9dQZF1DX4dyzvuaRJ0n\",\n" +
                "      \"id\": \"37i9dQZF1DX4dyzvuaRJ0n\",\n" +
                "      \"images\": [\n" +
                "        {\n" +
                "          \"height\": null,\n" +
                "          \"url\": \"https://i.scdn.co/image/ab67706f00000002fa65b59ff18a8d8eed85787a\",\n" +
                "          \"width\": null\n" +
                "        }\n" +
                "      ],\n" +
                "      \"name\": \"mint\",\n" +
                "      \"owner\": {\n" +
                "        \"display_name\": \"Spotify\",\n" +
                "        \"external_urls\": {\n" +
                "          \"spotify\": \"https://open.spotify.com/user/spotify\"\n" +
                "        },\n" +
                "        \"href\": \"https://api.spotify.com/v1/users/spotify\",\n" +
                "        \"id\": \"spotify\",\n" +
                "        \"type\": \"user\",\n" +
                "        \"uri\": \"spotify:user:spotify\"\n" +
                "      },\n" +
                "      \"primary_color\": null,\n" +
                "      \"public\": false,\n" +
                "      \"snapshot_id\": \"MTU3NTAwMzY2MCwwMDAwMDNmNzAwMDAwMTZlYjU4OGEwMDEwMDAwMDE2ZWFkYmE1M2Nl\",\n" +
                "      \"tracks\": {\n" +
                "        \"href\": \"https://api.spotify.com/v1/playlists/37i9dQZF1DX4dyzvuaRJ0n/tracks\",\n" +
                "        \"total\": 68\n" +
                "      },\n" +
                "      \"type\": \"playlist\",\n" +
                "      \"uri\": \"spotify:playlist:37i9dQZF1DX4dyzvuaRJ0n\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"collaborative\": false,\n" +
                "      \"description\": \"\",\n" +
                "      \"external_urls\": {\n" +
                "        \"spotify\": \"https://open.spotify.com/playlist/6dVo3NEKxlZAozFrjTELyx\"\n" +
                "      },\n" +
                "      \"href\": \"https://api.spotify.com/v1/playlists/6dVo3NEKxlZAozFrjTELyx\",\n" +
                "      \"id\": \"6dVo3NEKxlZAozFrjTELyx\",\n" +
                "      \"images\": [\n" +
                "        {\n" +
                "          \"height\": 640,\n" +
                "          \"url\": \"https://i.scdn.co/image/5ac91d99a266be79a77521e12f8a7150609a5c9a\",\n" +
                "          \"width\": 640\n" +
                "        }\n" +
                "      ],\n" +
                "      \"name\": \"Pursuit Of Happiness\",\n" +
                "      \"owner\": {\n" +
                "        \"display_name\": \"csbozus\",\n" +
                "        \"external_urls\": {\n" +
                "          \"spotify\": \"https://open.spotify.com/user/csbozus\"\n" +
                "        },\n" +
                "        \"href\": \"https://api.spotify.com/v1/users/csbozus\",\n" +
                "        \"id\": \"csbozus\",\n" +
                "        \"type\": \"user\",\n" +
                "        \"uri\": \"spotify:user:csbozus\"\n" +
                "      },\n" +
                "      \"primary_color\": null,\n" +
                "      \"public\": false,\n" +
                "      \"snapshot_id\": \"NCwzMDU5MmRjNWQ0N2Y2NWM0MTE1NTlhYjNjYzE5OTA3NmNhMmZjMDZl\",\n" +
                "      \"tracks\": {\n" +
                "        \"href\": \"https://api.spotify.com/v1/playlists/6dVo3NEKxlZAozFrjTELyx/tracks\",\n" +
                "        \"total\": 3\n" +
                "      },\n" +
                "      \"type\": \"playlist\",\n" +
                "      \"uri\": \"spotify:playlist:6dVo3NEKxlZAozFrjTELyx\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"limit\": 20,\n" +
                "  \"next\": \"https://api.spotify.com/v1/users/csbozus/playlists?offset=20&limit=20\",\n" +
                "  \"offset\": 0,\n" +
                "  \"previous\": null,\n" +
                "  \"total\": 63\n" +
                "}";
        String[] playlists = httpResponse.split("collaborative");

        ArrayList<String> playlists2 = new ArrayList<>();
        System.out.println(playlists2.size());
        for (int i = 1; i < 15; i++) {
            playlists2.add(playlists[i]);
        }
        for (int i = 0; i < playlists2.size(); i++) {
            System.out.println(playlists2.get(i));
            System.out.println();
        }
        System.out.println(playlists2.size());
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        for (int i = 0; i < playlists2.size(); i++) {
            data.add(new ArrayList<String>(3));
            ArrayList<String> arrayList = data.get(i);
            String current = playlists2.get(i);
            for (int j = 0; j < current.length()-10; j++) {
                if(current.substring(j, j+10).matches("\"spotify\":")) {
                    int k = j+12;
                    StringBuilder href = new StringBuilder(40);
                    while(current.charAt(k) != '"') {
                        href.append(current.charAt(k));
                        k++;
                    }
                    arrayList.add(href.toString());
                }
                if(current.substring(j, j+8).matches("\"name\": ")) {
                    int k = j+9;
                    StringBuilder name = new StringBuilder(40);
                    while(current.charAt(k) != '"') {
                        name.append(current.charAt(k));
                        k++;
                    }
                    arrayList.add(name.toString());
                }
                if(current.substring(j, j+7).matches("\"url\": ")) {
                    int k = j+8;
                    StringBuilder image = new StringBuilder(40);
                    while(current.charAt(k) != '"') {
                        image.append(current.charAt(k));
                        k++;
                    }
                    arrayList.add(image.toString());
                }
            }
        }
        for (int i = 0; i < data.size(); i++) {
            ArrayList<String> current = data.get(i);
            current.remove(current.size()-1);
            System.out.println(current.toString());
            playlistList.add(current.get(current.size()-1));
            linksList.add(current.get(0));
            if(current.size() == 2) imagesList.add(null);
            else imagesList.add(current.get(1));
        }
        imagesList.stream().forEach(i -> System.out.println(i));
    }
}
