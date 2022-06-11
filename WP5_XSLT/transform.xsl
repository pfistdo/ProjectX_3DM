<?xml version="1.0"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template match="/">
        <html>

            <head>
                <title>Project X - Shapes</title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
                      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
                      crossorigin="anonymous"/>
                <link rel="stylesheet"
                      href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"/>
                <link rel="stylesheet"
                      href="https://cdnjs.cloudflare.com/ajax/libs/bootswatch/5.1.3/cosmo/bootstrap.min.css"/>
            </head>

            <body>

                <header>
                    <div class="navbar navbar-dark bg-dark box-shadow">
                        <div class="container d-flex justify-content-between">
                            <a href="#" class="navbar-brand d-flex align-items-center">
                                <strong>Shapes</strong>
                            </a>
                        </div>
                    </div>
                </header>

                <div class="container">
                    <div class="row row-cols-1 row-cols-md-3 g-4 py-5">
                        <xsl:for-each select="resultset/diagram">
                            <!-- Class card -->
                            <div class="col">
                                <div class="card" style="width: 18rem;">
                                    <div class="card-body">
                                        <h5 class="card-title">Shape - <xsl:value-of select="id"/></h5>
                                        <p class="card-text"><xsl:value-of select="dtype"/></p>
                                        <p class="card-text"><xsl:value-of select="name"/></p>
                                    </div>
                                </div>
                            </div>

                        </xsl:for-each>
                    </div>
                </div>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
                        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
                        crossorigin="anonymous"/>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>