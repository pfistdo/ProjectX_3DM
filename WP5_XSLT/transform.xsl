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
                  <table class="table table-striped table-hover">
                        <thead>
                            <tr>
                            <th scope="col">#</th>
                            <th scope="col">Type</th>
                            <th scope="col">Name</th>
                            <th scope="col">Color</th>
                            <th scope="col">Size</th>
                            </tr>
                        </thead>
                        <tbody>
                            <xsl:for-each select="resultset/diagram">
                                <tr>
                                <th scope="row"><xsl:value-of select="id"/></th>
                                <td><xsl:value-of select="dtype"/></td>
                                <td><xsl:value-of select="name"/></td>
                                <td><xsl:value-of select="color"/></td>
                                <td><xsl:value-of select="size"/></td>
                                </tr>
                            </xsl:for-each>
                        </tbody>
                    </table>
                </div>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
                        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
                        crossorigin="anonymous"/>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>